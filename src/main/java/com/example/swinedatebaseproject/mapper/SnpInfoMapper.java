package com.example.swinedatebaseproject.mapper;

import com.example.swinedatebaseproject.domain.SnpInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author s1mple
* @description 针对表【snp_info】的数据库操作Mapper
* @createDate 2023-05-30 21:54:00
* @Entity com.example.swinedatebaseproject.domain.SnpInfo
*/
@SuppressWarnings("ALL")
public interface SnpInfoMapper extends BaseMapper<SnpInfo> {

    List<SnpInfo> selectPageV1(@Param("offset") int offset, @Param("length") int length);

    List<SnpInfo> selectPageV2(@Param("pos") int pos, @Param("length") int length);

}




