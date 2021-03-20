/**
 * @Description: TODO
 * @author: scott
 * @date: 2021年03月05日 16:25
 */
package com.gxb.swagger.config;

import com.google.common.base.Predicate;
import com.gxb.swagger.soldier.interfaceDemo.NotIncludeSwagger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Contact;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.google.common.base.Predicates.not;
import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;
import static springfox.documentation.builders.RequestHandlerSelectors.withMethodAnnotation;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 配置 Swagger 的 Docket 的 Bean 实例
     * @return
     */
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
//         .apis(RequestHandlerSelectors.basePackage("com.soldier.controller"))
                // 自定义注解设置不需要生成接口文档的方法
                .apis(not((withMethodAnnotation(NotIncludeSwagger.class))))
                /*.paths(allowPaths())*/
                .build();

    }

    private Predicate<String> allowPaths() {
        return or(regex("/demo/.*"));
    }

    //配置 Swagger信息=apiInfo
    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("Hedon","https://home.cnblogs.com/u/gxbmjz0721","1327835403@qq.com");

        return new ApiInfo("Swagger API 文档",                    //文档标题
                "这个是一个 梦魇Swagger 接口文档。",              //文档描述
                "v1.0",                                       //文档版本
                "https://home.cnblogs.com/u/gxbmjz0721",                   //队伍的网站地址
                contact,                                              //作者信息
                "Apache 2.0",                                  //许可证
                "http://www.apache.org/licenses/LICENSE-2.0",//许可证Url
                new ArrayList());
    }


    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

        System.err.println(new Date());
    }
}
