package swinedb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import swinedb.domain.Chromosome;
import swinedb.service.ChromosomeService;
import swinedb.mapper.ChromosomeMapper;
import org.springframework.stereotype.Service;

/**
* @author s1mple
* @description 针对表【chromosome】的数据库操作Service实现
* @createDate 2022-11-14 21:51:12
*/
@Service
public class ChromosomeServiceImpl extends ServiceImpl<ChromosomeMapper, Chromosome>
    implements ChromosomeService{

}




