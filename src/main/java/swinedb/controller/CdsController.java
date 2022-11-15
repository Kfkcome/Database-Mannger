package swinedb.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swinedb.constant.MyBatisConstants;
import swinedb.domain.Cds;
import swinedb.service.CdsService;
import swinedb.util.ObjectUtils;
import swinedb.util.ResponseDataUtils;
import swinedb.util.ResponseResult;

import java.util.List;

/**
 * @Author 刘铭康
 * @Date  2022/11/14
 */
@RestController
@RequestMapping("/cds")
public class CdsController {

    @Autowired
    CdsService cdsService;

    @GetMapping("/{id}")
    public ResponseResult getCdsById(@PathVariable Integer id) {
        Cds cds = cdsService.getById(id);
        return ResponseDataUtils.getResponseResult(Cds.class, cds);
    }

    @GetMapping("/all")
    public ResponseResult getAllCds() {
        List<Cds> list = cdsService.list();
        return ResponseDataUtils.getResponseResult(Cds.class, list);

    }

    @GetMapping("/page/{current}")
    public ResponseResult getCdsBasePage(@PathVariable Integer current) {
        Page<Cds> cdsPage = new Page<>(current, MyBatisConstants.PAGE_SIZE);
        List<Cds> records = cdsService.page(cdsPage).getRecords();
        return ResponseDataUtils.getResponseResult(Cds.class, records);
    }
}
