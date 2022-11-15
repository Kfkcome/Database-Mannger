package swine_search.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import swine_search.domain.Species;
import swine_search.service.SpeciesService;
import swine_search.mapper.SpeciesMapper;
import org.springframework.stereotype.Service;

/**
* @author s1mple
* @description 针对表【species】的数据库操作Service实现
* @createDate 2022-11-14 21:51:12
*/
@Service
public class SpeciesServiceImpl extends ServiceImpl<SpeciesMapper, Species>
    implements SpeciesService{

}




