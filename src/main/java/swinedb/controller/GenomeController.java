package swinedb.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swinedb.constant.MyBatisConstants;
import swinedb.domain.Genome;
import swinedb.service.GenomeService;

import java.util.List;

/**
 * @author 刘铭康
 * @version 2022/11/14
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
