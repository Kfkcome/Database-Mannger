package swine_search.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import swine_search.domain.Chromosome;
import swine_search.mapper.ChromosomeMapper;
import swine_search.service.ChromosomeService;

/**
* @author s1mple
* @description 针对表【chromosome】的数据库操作Service实现
* @createDate 2022-11-21 19:22:45
*/
@Service
public class ChromosomeServiceImpl extends ServiceImpl<ChromosomeMapper, Chromosome>
    implements ChromosomeService{

}




