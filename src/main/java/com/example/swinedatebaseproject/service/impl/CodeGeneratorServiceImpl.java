package com.example.swinedatebaseproject.service.impl;

import com.example.swinedatebaseproject.constant.CommonConstants;
import com.example.swinedatebaseproject.constant.MySQLContstants;
import com.example.swinedatebaseproject.constant.SqlConstants;
import com.example.swinedatebaseproject.service.CodeGeneratorService;
import javassist.*;
import javassist.bytecode.AccessFlag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @作者 DD
 * @创建时间 2023/3/16
 */

@Slf4j
@Service
public class CodeGeneratorServiceImpl implements CodeGeneratorService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final ClassPool CLASS_POOL = ClassPool.getDefault();

    private static final String DOMAIN_PACKAGE = "com.example.swinedatebaseproject.domain";


    @Override
    public boolean generateDomain(String domain, Map<String, String> params) {

        if (!StringUtils.hasText(domain)) {
            return false;
        }

        ArrayList<String> columns = new ArrayList<>(params.keySet());
        List<String> types = List.copyOf(params.values());
        List<List<String>> typeAndLengths = initializeString(types);
        if (Objects.isNull(typeAndLengths)) {
            return false;
        } else if (typeAndLengths.size() != columns.size()) {
            return false;
        } else {
            String sql = generateSql(domain,columns,typeAndLengths);
//            executeSql(sql);
            try {
                generateDomainClass(domain,columns,typeAndLengths);
            } catch (CannotCompileException e) {
                return false;
            }
            return true;
        }
    }

    /**
     * @param types {"int,1","char,11"}
     * @return {{"int",1},{"char","1"}}
     */
    public ArrayList<List<String>> initializeString(List<String> types) {

        ArrayList<List<String>> typeAndLengths = new ArrayList<>();
        types.forEach(typeAndLength->{
            String[] splits = typeAndLength.split(",");
            String type = splits[0];

            if (MySQLContstants.INT.equals(type)) {
                checkAndAddType(splits, MySQLContstants.INT_MAX_LENGTH, typeAndLengths, type);
            } else if (MySQLContstants.LONG.equals(type)) {
                checkAndAddType(splits, MySQLContstants.LONG_MAX_LENGTH, typeAndLengths, type);
            } else if (MySQLContstants.CHAR.equals(type)) {
                checkAndAddType(splits, MySQLContstants.CHAR_MAX_LENGTH, typeAndLengths, type);
            } else if (MySQLContstants.VARCHAR.equals(type)) {
                checkAndAddType(splits, MySQLContstants.VARCHAR_MAX_LENGTH, typeAndLengths, type);
            }
        });

        if (types.size() != typeAndLengths.size()) {
            return null;
        }
        return typeAndLengths;
    }

    /**
     * @param splits [type,length]
     * @param maxLength 类型最大长度
     * @param typeAndLengths {{"int",1},{"char","1"}}
     * @param type int/char
     */
    private void checkAndAddType(String[] splits, Integer maxLength, List<List<String>> typeAndLengths, String type) {
        if (splits.length == 2) {
            Integer length;
            try {
                length = Integer.valueOf(splits[1]);
            } catch (NumberFormatException e) {
                log.error("非法字段长度");
                return;
            }
            if (length > maxLength) {
                log.error("自定义字段长度超过最大长度");
                return;
            }
            typeAndLengths.add(new ArrayList<>(1){
                {
                    add(type);
                    add(length.toString());
                }
            });
        } else {
            typeAndLengths.add(new ArrayList<>(1){
                {
                    add(type);
                    add(maxLength.toString());
                }
            });
        }
    }

    /**
     * @param domain 表名
     * @param columns 列名列表
     * @param typeAndLengths {{"int",1},{"char","1"}}
     */
    private void generateDomainClass(String domain,List<String> columns,List<List<String>> typeAndLengths) throws CannotCompileException {
        String className = getClassName(domain);
        List<String> fieldNameList = getFieldNameList(columns);
        List<String> fieldTypeList = getFieldTypeList(typeAndLengths);
        CtClass ctClass = getCtClass(className);
        setCtField(fieldNameList, ctClass, fieldTypeList);
        ctClass.toClass(Thread.currentThread().getContextClassLoader(),Integer.class.getProtectionDomain());
    }

    private CtClass getCtClass(String className) {
        CtClass ctClass = CLASS_POOL.makeClass(DOMAIN_PACKAGE+"."+className);
        ctClass.setModifiers(AccessFlag.PUBLIC);

        return ctClass;
    }

    private String getClassName(String domain) {
        return getStandardJavaClassName(domain);
    }

    private String getStandardJavaClassName(String name) {
        String[] splits;
        if ((splits = name.split(MySQLContstants.SEPARATOR_A)).length == 0) {
            splits = name.split(MySQLContstants.SEPARATOR_B);
        }
        StringBuilder nameBuilder = new StringBuilder();
        for (String split : splits) {
            nameBuilder.append(StringUtils.capitalize(split));
        }
        return nameBuilder.toString();
    }

    private List<String> getFieldNameList(List<String> columns) {
        ArrayList<String> fieldList = new ArrayList<>();
        columns.forEach(column->{
            fieldList.add(getStandardJavaFieldName(column));
        });
        return fieldList;
    }

    private String getStandardJavaFieldName(String name) {
        String[] splits;
        if ((splits = name.split(MySQLContstants.SEPARATOR_A)).length == 0) {
            splits = name.split(MySQLContstants.SEPARATOR_B);
        }
        StringBuilder nameBuilder = new StringBuilder();
        nameBuilder.append(splits[0]);
        for (int i = 1; i < splits.length; i++) {
            nameBuilder.append(splits[i]);
        }
        return nameBuilder.toString();
    }

    private List<String> getFieldTypeList(List<List<String>> typeAndLengths) {
        ArrayList<String> fieldTypeList = new ArrayList<>();
        typeAndLengths.forEach(typeAndLength -> {
            String mysqlType = typeAndLength.get(0);
            if (MySQLContstants.INT.equals(mysqlType)) {
                fieldTypeList.add(CommonConstants.INTEGER);
            } else if (MySQLContstants.LONG.equals(mysqlType)) {
                fieldTypeList.add(CommonConstants.LONG);
            } else if (MySQLContstants.CHAR.equals(mysqlType)) {
                fieldTypeList.add(CommonConstants.STRING);
            } else if (MySQLContstants.VARCHAR.equals(mysqlType)) {
                fieldTypeList.add(CommonConstants.STRING);
            }
        });
        return fieldTypeList;
    }


    private void setCtField(List<String> fieldNameList, CtClass ctClass, List<String> fieldTypeList) throws CannotCompileException {
        for (int i = 0; i < fieldNameList.size(); i++) {
            if (CommonConstants.INTEGER.equals(fieldTypeList.get(i))) {
                CtField ctField = new CtField(CLASS_POOL.makeClass(CommonConstants.INTEGER_CLASS), fieldNameList.get(i), ctClass);
                ctField.setModifiers(AccessFlag.PRIVATE);
                ctClass.addField(ctField);
            } else if (CommonConstants.LONG.equals(fieldTypeList.get(i))) {
                CtField ctField = new CtField(CLASS_POOL.makeClass(CommonConstants.LONG_CLASS), fieldNameList.get(i), ctClass);
                ctField.setModifiers(AccessFlag.PRIVATE);
                ctClass.addField(ctField);
            }else if (CommonConstants.STRING.equals(fieldTypeList.get(i))) {
                CtField ctField = new CtField(CLASS_POOL.makeClass(CommonConstants.STRING_CLASS), fieldNameList.get(i), ctClass);
                ctField.setModifiers(AccessFlag.PRIVATE);
                ctClass.addField(ctField);
            }
        }
    }

    private String generateSql(String domain, ArrayList<String> columns, List<List<String>> typeAndLengths) {
        StringBuilder stringBuilder = new StringBuilder(SqlConstants.CREATE_TABLE_PREFIX);
        stringBuilder.append(domain);
        stringBuilder.append("(");
        for (int i = 0; i < columns.size(); i++) {
            stringBuilder.append(columns.get(i));
            stringBuilder.append(" ");
            stringBuilder.append(typeAndLengths.get(i).get(0));
            stringBuilder.append("(");
            stringBuilder.append(typeAndLengths.get(i).get(1));
            stringBuilder.append(")");
            stringBuilder.append(",");
        }

        String sql = stringBuilder.toString();
        sql = sql.substring(0, sql.length() - 1);
        sql += ");";
        log.info(sql);
        return sql;
    }

    /**
     * 执行SQL语句
     */
    private void executeSql(String sql) {
        jdbcTemplate.execute(sql);
    }

}
