package com.jiangtj.example.junit5.extend;

import com.jiangtj.example.junit5.base.Book;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2020/2/26 0:07 End.
 */
public class BookParameterResolver implements ParameterResolver {
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.isAnnotated(BookInject.class);
    }
    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.findAnnotation(BookInject.class)
                .map(book -> Book.of(book.title(), book.price()))
                .orElse(null);
    }
}
