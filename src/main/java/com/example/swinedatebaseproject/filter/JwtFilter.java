package com.example.swinedatebaseproject.filter;

import com.example.swinedatebaseproject.cache.UserCache;
import com.example.swinedatebaseproject.service.AdministratorService;
import com.example.swinedatebaseproject.service.CommonUserService;
import com.example.swinedatebaseproject.util.JwtUtils;
import com.example.swinedatebaseproject.util.ResponseResult;
import com.example.swinedatebaseproject.util.ResponseResultCode;
import com.example.swinedatebaseproject.util.WebUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * @Author 刘铭康
 * @Date 2022/11/14
 */

@Component
public class JwtFilter extends OncePerRequestFilter {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private static final String USERNAME = "userName";

    public static final String LOGIN_PREFIX = "/login";

    public static final String REGISTER_PREFIX = "/register";


    @Autowired
    CommonUserService commonUserService;

    @Autowired
    AdministratorService administratorService;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        String requestURI = request.getRequestURI();
        if (requestURI.contains(LOGIN_PREFIX) || requestURI.contains(REGISTER_PREFIX)) {
            filterChain.doFilter(request,response);
        }

        String header = request.getHeader("Authentication");
        if (Objects.isNull(header)) {
            ResponseResult responseResult = ResponseResult.error(ResponseResultCode.NOT_REGISTER.getCode(), ResponseResultCode.NOT_REGISTER.getMessage());
            String value = objectMapper.writeValueAsString(responseResult);
            WebUtils.renderString(response, value);
            return;
        }

        String userName = (String) JwtUtils.parseJWT(header).get(USERNAME);
        if (Objects.isNull(userName)) {
            ResponseResult responseResult = ResponseResult.error(ResponseResultCode.AUTHEMTICATION_FAIL.getCode(), ResponseResultCode.AUTHEMTICATION_FAIL.getMessage());
            String value = objectMapper.writeValueAsString(responseResult);
            WebUtils.renderString(response, value);
            return;
        }

        if (UserCache.COMMON_USERS.contains(userName)) {
            filterChain.doFilter(request, response);
        } else if (UserCache.ADMINISTRATORS.contains(userName)) {
            filterChain.doFilter(request, response);
        }else{
            ResponseResult responseResult = ResponseResult.error(ResponseResultCode.AUTHEMTICATION_FAIL.getCode(), ResponseResultCode.AUTHEMTICATION_FAIL.getMessage());
            String value = objectMapper.writeValueAsString(responseResult);
            WebUtils.renderString(response, value);
            return;
        }
    }
}
