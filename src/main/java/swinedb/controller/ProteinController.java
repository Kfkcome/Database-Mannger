package swinedb.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swinedb.constant.MyBatisConstants;
import swinedb.domain.Protein;
import swinedb.service.ProteinService;
import swinedb.util.ResponseDataUtils;
import swinedb.util.ResponseResult;

import java.util.List;
/**
 * @author 刘铭康
 * @version 2022/11/14
 */
@RestController
@RequestMapping("")
public class ProteinController {
    @Autowired
    ProteinService proteinService;

    @GetMapping("/{id}")
    public ResponseResult getProteinById(@PathVariable Integer id) {
        Protein protein = proteinService.getById(id);
        return ResponseDataUtils.getResponseResult(Protein.class, protein);
    }

    @GetMapping("/all")
    public ResponseResult getAllProtein() {
        List<Protein> list = proteinService.list();
        return ResponseDataUtils.getResponseResult(Protein.class, list);
    }

    @GetMapping("/page")
    public ResponseResult getCdsBasePage(Integer current) {
        Page<Protein> proteinPage = new Page<>(current, MyBatisConstants.PAGE_SIZE);
        List<Protein> records = proteinService.page(proteinPage).getRecords();
        return ResponseDataUtils.getResponseResult(Protein.class, records);
    }
}
