package com.jiangtj.example.junit5.extend;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2020/2/26 0:11 End.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface BookInject {
    String title();
    int price() default 0;
}
