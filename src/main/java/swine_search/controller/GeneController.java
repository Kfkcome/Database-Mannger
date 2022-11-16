package swine_search.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swine_search.constant.MyBatisConstants;
import swine_search.domain.Gene;
import swine_search.service.GeneService;
import swine_search.util.ResponseDataUtils;
import swine_search.util.ResponseResult;

import java.util.List;

/**
 * @Author 刘铭康
 * @Date  2022/11/14
 */
@RestController
@RequestMapping("/gene")
public class GeneController {
    @Autowired
    GeneService geneService;

    @GetMapping("/id/{id}")
    public ResponseResult getGeneById(@PathVariable Integer id) {
        Gene gene = geneService.getById(id);
        return ResponseDataUtils.getResponseResult(gene.getClass(), gene);
    }

    @GetMapping("/all")
    public ResponseResult getAllGene() {
        List<Gene> list = geneService.list();
        return ResponseDataUtils.getResponseResult(Gene.class, list);
    }

    @GetMapping("/page/{current}")
    public ResponseResult getCdsBasePage(@PathVariable Integer current) {
        Page<Gene> genePage = new Page<>(current, MyBatisConstants.PAGE_SIZE);
        List<Gene> records = genePage.getRecords();
        return ResponseDataUtils.getResponseResult(Gene.class, records);
    }

    @GetMapping("/page-count")
    public ResponseResult getPageCount() {
        Long totalRows = geneService.count();
        Long pageCount = totalRows % MyBatisConstants.PAGE_SIZE == 0 ? totalRows / MyBatisConstants.PAGE_SIZE : totalRows / MyBatisConstants.PAGE_SIZE + 1;
        // TODO: 2022/11/16 基于路径？？？ 动态获取keyName
        return ResponseDataUtils.getResponseResult("pageCount", pageCount);
    }
}
