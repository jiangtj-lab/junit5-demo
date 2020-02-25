package com.jiangtj.example.junit5.extend;

import com.jiangtj.example.junit5.base.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2020/2/26 0:16 End.
 */
@Slf4j
public class BookParameterTest {
    @Test
    @ExtendWith(BookParameterResolver.class)
    void exec(@BookInject(title = "删库") Book book) {
        log.info(book.toString());
    }
}
