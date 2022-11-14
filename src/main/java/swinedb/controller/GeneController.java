package swinedb.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swinedb.constant.MyBatisConstants;
import swinedb.domain.Gene;
import swinedb.service.GeneService;
import swinedb.util.ResponseDataUtils;
import swinedb.util.ResponseResult;
import swinedb.util.ResponseResultCode;

import java.util.List;

/**
 * @author 刘铭康
 * @version 2022/11/14
 */
@RestController
@RequestMapping("/gene")
public class GeneController {
    @Autowired
    GeneService geneService;

    @GetMapping("/{id}")
    public ResponseResult getGeneById(@PathVariable Integer id) {
        Gene gene = geneService.getById(id);
        return ResponseDataUtils.getResponseResult(gene.getClass(), gene);
    }

    @GetMapping("/all")
    public ResponseResult getAllGene() {
        List<Gene> list = geneService.list();
        return ResponseDataUtils.getResponseResult(Gene.class, list);
    }

    @GetMapping("/page")
    public ResponseResult getCdsBasePage(Integer current) {
        Page<Gene> genePage = new Page<>(current, MyBatisConstants.PAGE_SIZE);
        List<Gene> records = genePage.getRecords();
        return ResponseDataUtils.getResponseResult(Gene.class, records);
    }
}
