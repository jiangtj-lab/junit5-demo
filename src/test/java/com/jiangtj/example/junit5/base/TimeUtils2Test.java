package com.jiangtj.example.junit5.base;

import com.jiangtj.example.junit5.TimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.time.Instant;

/**
 * Created by MrTT (jiang.taojie@foxmail.com)
 * 2020/1/16.
 */
@DisplayNameGeneration(TimeUtils2Test.ReplaceUnderscores.class)
class TimeUtils2Test {
    @Test
    void hello() {
        Instant now = Instant.now();
        String expect = "现在时间是：" + now.toString();
        Assertions.assertEquals(expect, TimeUtils.hello(now));
    }
    static class ReplaceUnderscores extends DisplayNameGenerator.ReplaceUnderscores {
        @Override
        public String generateDisplayNameForClass(Class<?> testClass) {
            return "哈哈哈";
        }
    }
}

