package com.hw.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : hjs
 * @Description : 
 * @Date : Created By 2020/11/24 14:12
 */
@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List resources = new ArrayList<>();
        /**
         * 参数:
         * name：自定义的服务的名字
         * location:指定是微服务的路径   /前缀/服务名/v2/api-docs
         *      ——/前缀/服务名，必须和【配置文件】中【路由的】配置一致
         */
        // 这里是配置的每个资源 的服务名称（网关配置的名字）
        resources.add(swaggerResource("权限",
                "/chat/authority/v2/api-docs", "2.0"));
        
        return resources;
    }

    /**
     *
     * @param name
     * @param location
     * @param version
     * @return
     */
    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}