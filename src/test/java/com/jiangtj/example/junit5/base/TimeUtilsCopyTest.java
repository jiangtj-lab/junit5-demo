package com.jiangtj.example.junit5.base;

import com.jiangtj.example.junit5.TimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Instant;

/**
 * Created by MrTT (jiang.taojie@foxmail.com)
 * 2020/1/16.
 */
@Disabled("Disabled 因为重复")
class TimeUtilsCopyTest {
    @Test
    void hello() {
        Instant now = Instant.now();
        String expect = "现在时间是：" + now.toString();
        Assertions.assertEquals(expect, TimeUtils.hello(now));
    }
}

