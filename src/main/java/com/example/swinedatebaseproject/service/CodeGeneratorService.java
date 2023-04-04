package com.example.swinedatebaseproject.service;

import java.util.Map;

/**
 * @作者 DD
 * @创建时间 2023/3/16
 */
public interface CodeGeneratorService {
    boolean generateDomain(String domain, Map<String, String> params);

}
