package com.fxk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author fuqiang01
 * @date 2020/5/4 15:42
 * @description
 */
@EnableSwagger2
@Configuration
@EnableWebMvc
public class SwaggerConfig {

    @Bean
    public Docket restfulApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("bagevent-web")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(true)
                .forCodeGeneration(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.fxk.controller"))
                .build()
                ;
    }

}
