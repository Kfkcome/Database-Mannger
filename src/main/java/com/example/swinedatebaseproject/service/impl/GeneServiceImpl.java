package com.example.swinedatebaseproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.swinedatebaseproject.domain.Gene;
import com.example.swinedatebaseproject.service.GeneService;
import com.example.swinedatebaseproject.mapper.GeneMapper;
import org.springframework.stereotype.Service;

/**
* @author s1mple
* @description 针对表【gene】的数据库操作Service实现
* @createDate 2023-04-16 14:59:21
*/
@Service
public class GeneServiceImpl extends ServiceImpl<GeneMapper, Gene>
    implements GeneService{

}




