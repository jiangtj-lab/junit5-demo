package com.jiangtj.example.junit5.extend;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2020/2/25 18:29 End.
 */
@Slf4j
public class ConditionalTest {
    @Pass("密码不对不执行")
    void notExec() {
        // code...
    }
    @Pass("我很帅")
    void exec() {
        // code...
    }
}
