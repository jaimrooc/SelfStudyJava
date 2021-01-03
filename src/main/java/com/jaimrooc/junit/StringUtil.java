package com.jaimrooc.junit;

public class StringUtil {

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str.trim()) || "null".equals(str.trim().toLowerCase());
    }
}