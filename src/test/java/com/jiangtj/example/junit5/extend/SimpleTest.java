package com.jiangtj.example.junit5.extend;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2020/2/25 13:01 End.
 */
@ExtendWith(DatabaseExtension.class)
public class SimpleTest {
    @Fast
    @ExtendWith(LogTestWatcher.class)
    void asserts() {
        assertTrue(true);
    }
    @Test
    @ExtendWith(IgnoreExceptionExtension.class)
    void exec2() throws Exception {
        throw new Exception("被忽略");
    }
    @Test
    @ExtendWith(IgnoreExceptionExtension.class)
    void exec3() throws Throwable {
        throw new Throwable("不被忽略");
    }
}
