package com.example.swinedatebaseproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.swinedatebaseproject.domain.Administrator;
import com.example.swinedatebaseproject.service.AdministratorService;
import com.example.swinedatebaseproject.mapper.AdministratorMapper;
import org.springframework.stereotype.Service;

/**
* @author s1mple
* @description 针对表【administrator】的数据库操作Service实现
* @createDate 2023-02-26 00:20:22
*/
@Service
public class AdministratorServiceImpl extends ServiceImpl<AdministratorMapper, Administrator>
    implements AdministratorService{

}




