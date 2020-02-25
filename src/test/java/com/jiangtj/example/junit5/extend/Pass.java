package com.jiangtj.example.junit5.extend;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2020/2/25 18:34 End.
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(PassConditionalExtension.class)
@Test
public @interface Pass {
    String value();
}
