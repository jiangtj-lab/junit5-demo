package com.jiangtj.example.junit5.base;

import com.jiangtj.example.junit5.TimeUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import static org.junit.jupiter.api.condition.OS.MAC;

/**
 * Created by MrTT (jiang.taojie@foxmail.com)
 * 2020/1/16.
 */
@Slf4j
@DisplayName("时间工具类测试")
class TimeUtilsTest {
    @Test
    void hello() {
        Instant now = Instant.now();
        String expect = "现在时间是：" + now.toString();
        Assertions.assertEquals(expect, TimeUtils.hello(now));
    }
    @Test
    void asserts() {
        assertEquals(1,2, () -> "1要是1");
    }
    @Test
    void assume() {
        assumingThat("DEV".equals(System.getenv("ENV")),
                () -> {
                    // 如果不为true这里将不执行
                    assertEquals(1, 1);
                });

        assumeTrue("DEV".equals(System.getenv("ENV")),
                () -> "Aborting test: not on developer workstation");
        // 如果不为true这里将不执行
    }
    @Tag("conditional")
    @Test
    @EnabledOnOs(MAC)
    void testOnMac() {
        log.info("exec on mac");
    }
    @Tag("conditional")
    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void testOnJava8() {
        log.info("exec on java 8");
    }
}