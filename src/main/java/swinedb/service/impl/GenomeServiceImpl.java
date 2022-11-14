package swinedb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import swinedb.domain.Genome;
import swinedb.service.GenomeService;
import swinedb.mapper.GenomeMapper;
import org.springframework.stereotype.Service;

/**
* @author s1mple
* @description 针对表【genome】的数据库操作Service实现
* @createDate 2022-11-14 21:51:12
*/
@Service
public class GenomeServiceImpl extends ServiceImpl<GenomeMapper, Genome>
    implements GenomeService{

}




