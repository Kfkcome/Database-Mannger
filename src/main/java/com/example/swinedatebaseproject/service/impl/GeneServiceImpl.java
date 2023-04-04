package com.example.swinedatebaseproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.swinedatebaseproject.domain.Gene;
import com.example.swinedatebaseproject.service.GeneService;
import com.example.swinedatebaseproject.mapper.GeneMapper;
import org.springframework.stereotype.Service;

/**
* @author s1mple
* @description 针对表【gene】的数据库操作Service实现
* @createDate 2023-02-26 00:20:23
*/
@Service
public class GeneServiceImpl extends ServiceImpl<GeneMapper, Gene>
    implements GeneService{

}




