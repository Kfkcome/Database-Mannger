package swine_search.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import swine_search.domain.Protein;
import swine_search.service.ProteinService;
import swine_search.mapper.ProteinMapper;
import org.springframework.stereotype.Service;

/**
* @author s1mple
* @description 针对表【protein】的数据库操作Service实现
* @createDate 2022-11-14 21:51:12
*/
@Service
public class ProteinServiceImpl extends ServiceImpl<ProteinMapper, Protein>
    implements ProteinService{

}



