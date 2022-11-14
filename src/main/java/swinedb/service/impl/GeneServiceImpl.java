package swinedb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import swinedb.domain.Gene;
import swinedb.service.GeneService;
import swinedb.mapper.GeneMapper;
import org.springframework.stereotype.Service;

/**
* @author s1mple
* @description 针对表【gene】的数据库操作Service实现
* @createDate 2022-11-14 21:51:12
*/
@Service
public class GeneServiceImpl extends ServiceImpl<GeneMapper, Gene>
    implements GeneService{

}




