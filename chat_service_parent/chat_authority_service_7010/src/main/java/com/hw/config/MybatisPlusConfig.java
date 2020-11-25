package com.hw.config;


import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author : hjs
 * @Description :
 * @Date : Created By 2020/11/24 14:58
 */
@Configuration //标识为配置类
@MapperScan("com.hw.mapper")
@EnableTransactionManagement        // 开启事务管理
public class MybatisPlusConfig {

    //注入mybatisPlus分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
