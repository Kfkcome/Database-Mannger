package swine_search.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swine_search.constant.MyBatisConstants;
import swine_search.domain.Protein;
import swine_search.service.ProteinService;
import swine_search.util.ResponseDataUtils;
import swine_search.util.ResponseResult;

import java.util.List;
/**
 * @Author 刘铭康
 * @Date  2022/11/14
 */
@RestController
@RequestMapping("/protein")
public class ProteinController {
    @Autowired
    ProteinService proteinService;

    @GetMapping("/id/{id}")
    public ResponseResult getProteinById(@PathVariable Integer id) {
        Protein protein = proteinService.getById(id);
        return ResponseDataUtils.getResponseResult(Protein.class, protein);
    }

    @GetMapping("/all")
    public ResponseResult getAllProtein() {
        List<Protein> list = proteinService.list();
        return ResponseDataUtils.getResponseResult(Protein.class, list);
    }

    @GetMapping("/page/{current}")
    public ResponseResult getCdsBasePage(@PathVariable Integer current) {
        Page<Protein> proteinPage = new Page<>(current, MyBatisConstants.PAGE_SIZE);
        List<Protein> records = proteinService.page(proteinPage).getRecords();
        return ResponseDataUtils.getResponseResult(Protein.class, records);
    }

    @GetMapping("/page-count")
    public ResponseResult getPageCount() {
        Long totalRows = proteinService.count();
        Long pageCount = totalRows % MyBatisConstants.PAGE_SIZE == 0 ? totalRows / MyBatisConstants.PAGE_SIZE : totalRows / MyBatisConstants.PAGE_SIZE + 1;
        // TODO: 2022/11/16 基于路径？？？ 动态获取keyName
        return ResponseDataUtils.getResponseResult("pageCount", pageCount);
    }
}
