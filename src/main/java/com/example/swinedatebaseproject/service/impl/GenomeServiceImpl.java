package com.example.swinedatebaseproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.swinedatebaseproject.domain.Genome;
import com.example.swinedatebaseproject.service.GenomeService;
import com.example.swinedatebaseproject.mapper.GenomeMapper;
import org.springframework.stereotype.Service;

/**
* @author s1mple
* @description 针对表【genome】的数据库操作Service实现
* @createDate 2023-04-16 14:59:22
*/
@Service
public class GenomeServiceImpl extends ServiceImpl<GenomeMapper, Genome>
    implements GenomeService{

}




