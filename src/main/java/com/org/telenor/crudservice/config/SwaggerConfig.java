package com.org.telenor.crudservice.config;


import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo()).select().paths(postPaths()).build();
    }

    private Predicate<String> postPaths() {
        return or(regex("/product.*"), regex("/product.*"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("EasyCart Products API")
                .description("EasyCart Products API for developers")
                .termsOfServiceUrl("http://localhost:8761/")
                .contact("hamza.ahmed@telenorbank.pk").license("EasyCart License")
                .licenseUrl("easycart@telenorbank.pk").version("1.0").build();
    }

}
