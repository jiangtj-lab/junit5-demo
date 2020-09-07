package com.jiangtj.example.junit5.extend;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.InvocationInterceptor;
import org.junit.jupiter.api.extension.ReflectiveInvocationContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by MrTT (jiang.taojie@foxmail.com)
 * 2020/9/7.
 */
@Slf4j
@ExtendWith(MyInvocationInterceptorTest.LogInvocationInterceptor.class)
public class MyInvocationInterceptorTest {

    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void showParameterized(String candidate) {
        log.error(candidate);
    }


    static class LogInvocationInterceptor implements InvocationInterceptor {
        @Override
        public void interceptTestTemplateMethod(Invocation<Void> invocation,
                                                ReflectiveInvocationContext<Method> invocationContext,
                                                ExtensionContext extensionContext) throws Throwable {
            Method executable = invocationContext.getExecutable();
            List<Object> arguments = invocationContext.getArguments();
            Class<?> targetClass = invocationContext.getTargetClass();
            log.info("executable method: " + executable.getName());
            log.info("arguments: " + arguments.stream().map(String::valueOf).collect(Collectors.joining()));
            log.info("targetClass: " + targetClass.getName());
            log.info("invocation.proceed() start");
            invocation.proceed();
            log.info("invocation.proceed() end");
        }
    }
}
