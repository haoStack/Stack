package cn.rmonkey.stack.utils;

import java.util.Date;
import java.util.UUID;

/**
 * @Author Zhaozihao (Zack)
 * @Description
 * @date 2022/5/9 16:37
 */
public class Generator {
    public static long idGenerator() {
        return new Date().getTime();
    }

    public static void main(String[] args) {
        System.out.println(idGenerator());
    }
}
