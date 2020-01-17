package com.jiangtj.example.junit5;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

/**
 * Created by MrTT (jiang.taojie@foxmail.com)
 * 2020/1/17.
 */
@Slf4j
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LifecycleTest {
    int num = 0;
    @BeforeAll
    static void initAll() {
        log.error("initAll");
    }
    @BeforeEach
    void init() {
        log.error("init");
    }
    @Test
    @Order(1)
    void doTest1() {
        log.error("num is " + num);
        num = 1;
        log.error("doTest1");
    }
    @Test
    @Order(2)
    void doTest2() {
        log.error("num is " + num);
        num = 2;
        log.error("doTest1");
    }
}
