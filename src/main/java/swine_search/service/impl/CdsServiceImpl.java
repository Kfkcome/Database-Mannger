package swine_search.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import swine_search.domain.Cds;
import swine_search.service.CdsService;
import swine_search.mapper.CdsMapper;
import org.springframework.stereotype.Service;

/**
* @author s1mple
* @description 针对表【cds】的数据库操作Service实现
* @createDate 2022-11-14 21:51:12
*/
@Service
public class CdsServiceImpl extends ServiceImpl<CdsMapper, Cds>
    implements CdsService{
}




