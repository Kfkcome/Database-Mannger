package com.example.swinedatebaseproject.service.impl;

import com.example.swinedatebaseproject.cache.UserCache;
import com.example.swinedatebaseproject.domain.Administrator;
import com.example.swinedatebaseproject.domain.CommonUser;
import org.springframework.stereotype.Service;

/**
 * @Author 刘铭康
 * @Date 2022/11/14
 */

@Service
public class RegisterServiceImpl implements com.example.swinedatebaseproject.service.RegisterService {
    @Override
    public boolean userRegister(CommonUser commonUser) {
        return UserCache.COMMON_USERS.contains(commonUser.getName());
    }

    @Override
    public boolean administratorRegister(Administrator administrator) {
        return UserCache.COMMON_USERS.contains(administrator.getName());
    }

}
