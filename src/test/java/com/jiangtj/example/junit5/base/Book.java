package com.jiangtj.example.junit5.base;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by MrTT (jiang.taojie@foxmail.com)
 * 2020/1/17.
 */
@Data
@AllArgsConstructor(staticName = "of")
public class Book {

    private String title;
    private int price;

    @Override
    public String toString() {
        return String.format("%s ($%d)", title, price);
    }
}
