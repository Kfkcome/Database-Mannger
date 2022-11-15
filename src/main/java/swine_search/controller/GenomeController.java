package swine_search.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swine_search.constant.MyBatisConstants;
import swine_search.domain.Genome;
import swine_search.service.GenomeService;

import java.util.List;

/**
 * @Author 刘铭康
 * @Date  2022/11/14
 */
@RestController
@RequestMapping("/genome")
@Deprecated
public class GenomeController {
    @Autowired
    GenomeService genomeService;

    @GetMapping("/{id}")
    public Genome getGenomeById(@PathVariable Integer id) {
        return genomeService.getById(id);
    }

    @GetMapping("/all")
    public List<Genome> getAllGenome() {
        return genomeService.list();
    }

    @GetMapping("/page")
    public List<Genome> getCdsBasePage(Integer current) {
        Page<Genome> genomePage = new Page<>(current, MyBatisConstants.PAGE_SIZE);
        return genomeService.page(genomePage).getRecords();
    }
}
