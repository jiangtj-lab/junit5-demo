package com.jiangtj.example.junit5.extend;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2020/2/26 0:35 End.
 */
public class IgnoreExceptionExtension implements TestExecutionExceptionHandler {
    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        if (throwable instanceof Exception) {
            return;
        }
        throw throwable;
    }
}
