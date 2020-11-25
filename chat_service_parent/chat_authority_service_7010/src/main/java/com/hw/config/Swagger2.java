package com.hw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author : hjs
 * @Description :
 * @Date : Created By 2020/11/24 15:00
 */
@Configuration
@EnableSwagger2 //开启swagger2的支持
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //对外暴露服务的包,以controller的方式暴露,所以就是 controller 的包.
                .apis(RequestHandlerSelectors.basePackage("com.hw.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("hw权限管理")
                .description("hw权限管理 接口文档说明")
                .contact(new Contact("hw", "", "942205879@qq.com"))
                .version("1.0")
                .build();
    }
}