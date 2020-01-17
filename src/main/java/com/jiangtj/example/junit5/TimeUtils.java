package com.jiangtj.example.junit5;

import java.time.Instant;

/**
 * Created by MrTT (jiang.taojie@foxmail.com)
 * 2020/1/16.
 */
public class TimeUtils {
    public static String hello(Instant now) {
        return "现在时间是：" + now.toString();
    }
}
