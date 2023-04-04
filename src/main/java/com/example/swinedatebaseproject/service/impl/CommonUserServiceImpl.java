package com.example.swinedatebaseproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.swinedatebaseproject.domain.CommonUser;
import com.example.swinedatebaseproject.service.CommonUserService;
import com.example.swinedatebaseproject.mapper.CommonUserMapper;
import org.springframework.stereotype.Service;

/**
* @author s1mple
* @description 针对表【common_user】的数据库操作Service实现
* @createDate 2023-02-26 00:20:22
*/
@Service
public class CommonUserServiceImpl extends ServiceImpl<CommonUserMapper, CommonUser>
    implements CommonUserService{

}




