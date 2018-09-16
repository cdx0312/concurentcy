package com.imooc.concurentcy.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: concurentcy
 * @author: cdx
 * @create: 2018-09-16 18:54
 * 用来标记线程不推荐的的类的注解
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface NotRecommend {
    String value() default "";
}
