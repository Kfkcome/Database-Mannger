package swine_search.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author  刘铭康
 * @Date 2022/11/14
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)

        // .groupName("分布式任务系统")
        .apiInfo(ApiInfo.DEFAULT)
        .select()
        // 接口包路径
        .apis(RequestHandlerSelectors.basePackage("swine_search.controller"))
        // 目标API范围
        .paths(PathSelectors.any())
        .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SwineSearchProject")
                .description("与棉花数据库匹配的后端系统")
                .termsOfServiceUrl("")
                .version("1.0")
                .license("Apache 2.0")
                .build();
    }





}
