package com.example.swinedatebaseproject.filter;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author 刘铭康
 * @Date 2022/11/14
 */

public class DynamicDatasourceFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        if (!request.getRequestURI().contains("/switch-datasource")) {
            filterChain.doFilter(request, response);
            return;
        }

        String targetDatasourceKey = request.getParameter("datasource");
        String dsKey="";
        if ("private".equals(targetDatasourceKey)) {
            dsKey = "private";
        } else if ("public".equals(targetDatasourceKey)) {
            dsKey = "public";
        } else {
            dsKey = "private";
        }

        try {
            DynamicDataSourceContextHolder.push(dsKey);
            filterChain.doFilter(request, response);
        } finally {
            DynamicDataSourceContextHolder.poll();
        }

    }
}
