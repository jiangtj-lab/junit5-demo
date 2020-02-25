package com.jiangtj.example.junit5.extend;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2020/2/26 0:28 End.
 */
@Slf4j
public class LogTestWatcher implements TestWatcher {
    @Override
    public void testSuccessful(ExtensionContext context) {
        log.info("wow, 成功了！");
    }
    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        // 取消
    }
    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        // 禁用（跳过）
    }
    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        // 失败
    }
}
