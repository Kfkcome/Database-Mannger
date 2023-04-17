package com.example.swinedatebaseproject.controller.data.special;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.swinedatebaseproject.constant.MyBatisConstants;
import com.example.swinedatebaseproject.controller.data.CommonController;
import com.example.swinedatebaseproject.domain.*;
import com.example.swinedatebaseproject.response.ResponseResult;
import com.example.swinedatebaseproject.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @作者 DD
 * @创建时间 2023/3/6
 */

@SuppressWarnings("ALL")
@Slf4j
@RestController
@RequestMapping(value = "orthogroups5genomesPlus", method = {RequestMethod.DELETE, RequestMethod.GET, RequestMethod.POST})
public class Orthogroups5genomesPlusController extends CommonController<Orthogroups5genomesPlus> {

    @Autowired
    A1AHauService a1AHauService;

    @Autowired
    A1HauService a1HauService;

    @Autowired
    A2HauService a2HauService;

    @Autowired
    B1HauService b1HauService;

    @Autowired
    C1HauService c1HauService;

    @Autowired
    D5HauService d5HauService;

    @Autowired
    E1HauService e1HauService;

    @Autowired
    F1HauService f1HauService;

    @Autowired
    G1HauService g1HauService;

    @Autowired
    K2HauService k2HauService;

    /**
     * 每隔time时间更新缓存结果
     */
    private ArrayList<Object> cachedResult = new ArrayList<>(10000);

    private Long time = 3600 * 1000L;

    private Long startTime = System.currentTimeMillis()-2*time;

    private String searchKey;



    @Autowired
    public Orthogroups5genomesPlusController(Orthogroups5genomesPlusService service) {
        super("cds_name");
        this.service = service;
    }

    @GetMapping("/fieldNames")
    @Override
    public ResponseResult getFieldNames() {
        return getFieldNamesActual();
    }

    @GetMapping("/id/{id}")
    @Override
    public ResponseResult getSingleDataById(@PathVariable Integer id) {
        return getSingleDataByIdActual(id);
    }

    @GetMapping("/all")
    @Override
    public ResponseResult getAllData() {
        return getAllDataActual();
    }

    @GetMapping("/page/{current}")
    @Override
    public ResponseResult getDataByPage(@PathVariable Integer current) {
        return getDataByPageActual(current);
    }

    @GetMapping("/page-count")
    @Override
    public ResponseResult getPageCount() {
        return getPageCountActual();
    }

    @DeleteMapping("/delete-single-row")
    @Override
    public ResponseResult deleteSingleRowById(@RequestBody Orthogroups5genomesPlus row) {
        return deleteSingleRowByIdActual(row);
    }

    @DeleteMapping("/delete-rows")
    @Override
    public ResponseResult deleteRowsByIds(@RequestBody List<Orthogroups5genomesPlus> rows) {
        return deleteRowsByIdsActual(rows);
    }

    @GetMapping("/rows-size")
    @Override
    public ResponseResult getRowsSize() {
        return getRowsSizeActual();
    }

    @GetMapping("/search/{name}")
    @Override
    public ResponseResult getData(@PathVariable String name) {
        return getDataActual(name);
    }

    @PostMapping("/upload")
    @Override
    public ResponseResult upload(@RequestParam("file") MultipartFile multipartFile) {
        return uploadActual(multipartFile);
    }

    @GetMapping("/search-multi-key")
    @Override
    public ResponseResult searchValueByMultiKey(@RequestParam("formValues") List<String> values, @RequestParam("currentPage") Integer currentPage) {
        return searchValueByMultiKeyActual(values, currentPage);
    }

    @PutMapping("/update-single-data")
    @Override
    public ResponseResult updateSingleData(@RequestParam("values") List<String> values, @RequestBody Orthogroups5genomesPlus object) {
        return updateSingleDataActual(values, object);
    }

    @PostMapping("/save-single-data")
    @Override
    public ResponseResult saveSingleData(@RequestBody Orthogroups5genomesPlus object) {
        return saveSingleDataActual(object);
    }

    @DeleteMapping("/delete-single-data")
    @Override
    public ResponseResult deleteSingleDataByColumns(@RequestParam List<String> singleRowValues) {
        return deleteSingleDataByColumnsActual(singleRowValues);
    }

    @DeleteMapping("/delete-multi-data-main")
    @Override
    public ResponseResult deleteBatchOnMainTable(@RequestBody List<Orthogroups5genomesPlus> values) {
        return deleteBatchOnMainTableActual(values);
    }


    @DeleteMapping("/delete-multi-data-sub")
    @Override
    public ResponseResult deleteBatchOnSubTable(@RequestParam List<String> formValues) {
        return deleteBatchOnSubTableActual(formValues);
    }

    @GetMapping("/orthogroup-page-size")
    public ResponseResult getPageSize() {
        int pageSize = cachedResult.size() % MyBatisConstants.PAGE_SIZE == 0 ? cachedResult.size() / MyBatisConstants.PAGE_SIZE : cachedResult.size() / MyBatisConstants.PAGE_SIZE + 1;
        return ResponseResult.success(pageSize);
    }

    @GetMapping("/search-orthogroup")
    public ResponseResult searchOrthogroup(@RequestParam String value, @RequestParam Long current) {

        ArrayList<Object> actualResult = new ArrayList<>();

        if (System.currentTimeMillis() - startTime >= time || Objects.isNull(searchKey) || !searchKey.equals(value)) {
            searchKey = value;
            startTime = System.currentTimeMillis();
            cachedResult.clear();
            for (String fieldName : fieldNames) {
                if ("id".equals(fieldName) || "serialVersionUID".equals(fieldName) || "orthogroup".equals(fieldName)) {
                    continue;
                }
                try {
                    // 获取数据表列名
                    // thisClass Orthogroups5genomesPlus
                    Field field = Orthogroups5genomesPlus.class.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    TableField tableField = field.getAnnotation(TableField.class);
                    String columnName = tableField.value();

                    // 获取纪录列表
                    QueryWrapper<Orthogroups5genomesPlus> queryWrapper = new QueryWrapper<>();
                    queryWrapper.like(columnName, value);
                    List<Orthogroups5genomesPlus> list = service.list(queryWrapper);

                    // 获取数据表列值
                    ArrayList<String> genes = new ArrayList<>();
                    for (Orthogroups5genomesPlus orthogroups5genomesPlus : list) {
                        genes.addAll(Arrays.asList(((String) field.get(orthogroups5genomesPlus)).split(",")));
                    }

                    // 获取其他实体Service
                    String serviceName = fieldName + "Service";
                    Field serviceField = Orthogroups5genomesPlusController.class.getDeclaredField(serviceName);
                    IService externalService = (IService) serviceField.get(this);

                    // 获取其他表纪录列表
                    QueryWrapper<Object> wrapper = new QueryWrapper<>();
                    for (String gene : genes) {
                        wrapper.like("attributes", gene).or();
                    }
                    wrapper.eq("feature", "gene");
                    Page<Object> page = new Page<>(current, Long.MAX_VALUE);
                    List<Object> records = externalService.page(page, wrapper).getRecords();
                    cachedResult.addAll(records);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // 手动分页
        // 防止最后一页数据未满导致列表溢出的情况
        Long bound1 = (current - 1) * MyBatisConstants.PAGE_SIZE + MyBatisConstants.PAGE_SIZE;
        Long bound2 = Long.valueOf(cachedResult.size());
        Long bound = bound1 >= bound2 ? bound2 : bound1;
        for (Long i = (current - 1) * MyBatisConstants.PAGE_SIZE; i < bound; i++) {
            actualResult.add(cachedResult.get(Math.toIntExact(i)));
        }

        return ResponseResult.success(actualResult);
    }

}

