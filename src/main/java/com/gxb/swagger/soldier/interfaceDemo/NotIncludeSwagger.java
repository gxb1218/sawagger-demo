package com.gxb.swagger.soldier.interfaceDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解设置不需要生成接口文档的方法
 * @author GXB
 * @data 2021-03-20
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotIncludeSwagger {

}
