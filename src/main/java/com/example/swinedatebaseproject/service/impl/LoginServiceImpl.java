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
public class LoginServiceImpl implements com.example.swinedatebaseproject.service.LoginService {
    @Override
    public boolean userLogin(CommonUser commonUser) {
        return UserCache.COMMON_USERS.contains(commonUser.getName());
    }

    @Override
    public boolean administratorLogin(Administrator administrator) {
        return UserCache.ADMINISTRATORS.contains(administrator.getName());
    }

}
