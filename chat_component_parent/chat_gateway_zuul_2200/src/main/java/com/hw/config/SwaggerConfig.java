package com.hw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author : hjs
 * @Description :
 * @Date : Created By 2020/11/24 14:10
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("hw聊天平台")
                .description("hw聊天平台-接口文档说明")
                .termsOfServiceUrl("http://localhost:2200") //网关的地址
                .contact(new Contact("hw", "", "942205879@qq.com"))
                .version("1.0")
                .build();
    }

}