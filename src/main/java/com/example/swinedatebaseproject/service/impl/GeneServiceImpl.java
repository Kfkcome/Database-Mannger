package com.example.swinedatebaseproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.swinedatebaseproject.domain.Gene;
import com.example.swinedatebaseproject.mapper.GeneMapper;
import com.example.swinedatebaseproject.service.GeneService;
import org.springframework.stereotype.Service;


/**
* @author s1mple
* @description 针对表【gene】的数据库操作Service实现
* @createDate 2022-11-14 21:51:12
*/
@Service
public class GeneServiceImpl extends ServiceImpl<GeneMapper, Gene>
    implements GeneService {

}




