package com.example.swinedatebaseproject.util;

import com.example.swinedatebaseproject.response.ResponseResultCode;
import org.springframework.util.StringUtils;

import java.io.IOException;

/**
 * @作者 DD
 * @创建时间 2023/7/16
 */
public class PythonUtil {
    public static String PYTHON_ORIGINAL_FILE_PATH;

    public static String PYTHON_EXECUTION_FILE_PATH;

    public static String DEFAULT_A_FILE_PATH;

    public static String DEFAULT_PHENO_FILE_PATH;

    static {

    }

    public static Object executeAndSaveFile(String aFilePath, String phenoFilePath) {
        if (StringUtils.hasText(aFilePath)) {
            aFilePath = DEFAULT_A_FILE_PATH;
        }
        if (StringUtils.hasText(phenoFilePath)) {
            phenoFilePath = DEFAULT_PHENO_FILE_PATH;
        }
        String[] arguments = new String[]{PYTHON_ORIGINAL_FILE_PATH, PYTHON_EXECUTION_FILE_PATH};
        Process proc;
        int result = 0;
        try {
            proc = Runtime.getRuntime().exec(arguments);
            result = proc.waitFor();
        } catch (IOException | InterruptedException e) {
            return ResponseResultCode.ERROR;
        }
        if (result == 1) {
            return ResponseResultCode.SUCCESS;
        } else {
            return ResponseResultCode.ERROR;
        }
    }

    public static void main(String[] args) {

    }

}
