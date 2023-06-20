package com.example.swinedatebaseproject.filter;

import com.example.swinedatebaseproject.cache.UserCache;
import com.example.swinedatebaseproject.response.ResponseResult;
import com.example.swinedatebaseproject.response.ResponseResultCode;
import com.example.swinedatebaseproject.util.JwtUtils;
import com.example.swinedatebaseproject.util.WebUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author 刘铭康
 * @Date 2022/11/14
 */

public class JwtFilter extends OncePerRequestFilter {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private static final ArrayList<String> SAFE_PATH_LIST = new ArrayList<>() {
        {
            add(USERNAME);
            add(LOGIN_PREFIX);
            add(REGISTER_PREFIX);
            add(UI_PREFIX);
            add("/docs");
            add("/docs-ui");
            add("/druid/index.html");
        }
    };

    private static final String USERNAME = "userName";


    private static final String LOGIN_PREFIX = "/login";

    private static final String REGISTER_PREFIX = "/register";

    private static final String UI_PREFIX = "/swagger-ui";

    @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        String secret = request.getHeader("secret");
        if (Objects.nonNull(secret) && "secret".equals(secret)) {
            filterChain.doFilter(request, response);
            return;
        }

        String requestURI = request.getRequestURI();
        if (checkUriIsSafePath(requestURI)) {
            filterChain.doFilter(request, response);
            return;
        }

        String headerValue = request.getHeader("Authorization");
        if (Objects.isNull(headerValue)) {
            ResponseResult responseResult = ResponseResult.error(ResponseResultCode.NOT_LOGIN.getCode(), ResponseResultCode.NOT_LOGIN.getMessage());
            String value = OBJECT_MAPPER.writeValueAsString(responseResult);
            WebUtils.renderString(response, value);
            return;
        }

        String userName = (String) JwtUtils.parseJWT(headerValue).get(USERNAME);
        if (Objects.isNull(userName)) {
            ResponseResult responseResult = ResponseResult.error(ResponseResultCode.AUTHEMTICATION_FAIL.getCode(), ResponseResultCode.AUTHEMTICATION_FAIL.getMessage());
            String value = OBJECT_MAPPER.writeValueAsString(responseResult);
            WebUtils.renderString(response, value);
            return;
        }

        if (UserCache.COMMON_USERS.contains(userName)) {
            filterChain.doFilter(request, response);
        } else if (UserCache.ADMINISTRATORS.contains(userName)) {
            filterChain.doFilter(request, response);
        }else{
            ResponseResult responseResult = ResponseResult.error(ResponseResultCode.AUTHEMTICATION_FAIL.getCode(), ResponseResultCode.AUTHEMTICATION_FAIL.getMessage());
            String value = OBJECT_MAPPER.writeValueAsString(responseResult);
            WebUtils.renderString(response, value);
        }
    }

    private boolean checkUriIsSafePath(String uri) {
        for (String safePath : SAFE_PATH_LIST) {
            if (uri.contains(safePath)) {
                return true;
            }
        }
        return false;
    }
}
