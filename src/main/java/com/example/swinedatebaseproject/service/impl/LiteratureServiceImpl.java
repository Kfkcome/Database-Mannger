package com.example.swinedatebaseproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.swinedatebaseproject.domain.Literature;
import com.example.swinedatebaseproject.service.LiteratureService;
import com.example.swinedatebaseproject.mapper.LiteratureMapper;
import org.springframework.stereotype.Service;

/**
* @author s1mple
* @description 针对表【literature】的数据库操作Service实现
* @createDate 2023-08-23 21:30:10
*/
@Service
public class LiteratureServiceImpl extends ServiceImpl<LiteratureMapper, Literature>
    implements LiteratureService{

}




