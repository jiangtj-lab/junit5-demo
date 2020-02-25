package com.jiangtj.example.junit5.extend;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2020/2/25 13:40 End.
 */
@Slf4j
public class DatabaseExtension implements BeforeAllCallback, AfterAllCallback {
    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        log.info("连接数据库");
    }
    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        log.info("关闭数据库");
    }
}
