package swine_search;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("swind")
public class SwineDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwineDbApplication.class, args);
    }

}
