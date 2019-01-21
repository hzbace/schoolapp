package com.qfedu.schoolapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 *@Author feri
 *@Date Created in 2019/1/4 10:02
 * Swagger的配置信息
 */
@Configuration
public class SwaggerConfig {
    public ApiInfo createApi(){
        return new ApiInfoBuilder().title("校园邦一款青春风的校园综合app").
                description("只为使你更加便捷").
                contact(new Contact("第五十项目小组","http://1000phone.com","hzbace@sohu.com")).build();
    }
    @Bean  //等价于 <bean>标签
    public Docket createDoc(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createApi()).select().
                apis(RequestHandlerSelectors.basePackage("com.qfedu.nwebapp.nwebapp")).build();
    }
}