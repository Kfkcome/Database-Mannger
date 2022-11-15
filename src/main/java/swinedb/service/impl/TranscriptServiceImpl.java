package swinedb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import swinedb.domain.Transcript;
import swinedb.service.TranscriptService;
import swinedb.mapper.TranscriptMapper;
import org.springframework.stereotype.Service;

/**
* @author s1mple
* @description 针对表【transcript】的数据库操作Service实现
* @createDate 2022-11-14 21:51:12
*/
@Service
public class TranscriptServiceImpl extends ServiceImpl<TranscriptMapper, Transcript>
    implements TranscriptService{

}



