package swine_search;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import swine_search.service.GeneExpService;

@SpringBootTest
class SwineDbApplicationTests {

    @Autowired
    GeneExpService geneExpService;

    @Test
    void contextLoads() {
        geneExpService.list();
    }

}
