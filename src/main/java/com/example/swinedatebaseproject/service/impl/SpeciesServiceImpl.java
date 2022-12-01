package com.example.swinedatebaseproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.swinedatebaseproject.domain.Species;
import com.example.swinedatebaseproject.mapper.SpeciesMapper;
import com.example.swinedatebaseproject.service.SpeciesService;
import org.springframework.stereotype.Service;


/**
* @author s1mple
* @description 针对表【species】的数据库操作Service实现
* @createDate 2022-11-14 21:51:12
*/
@Service
public class SpeciesServiceImpl extends ServiceImpl<SpeciesMapper, Species>
    implements SpeciesService {
}




