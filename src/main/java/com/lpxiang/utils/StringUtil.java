package com.lpxiang.utils;

/**
 * Created by Tracy on 2016/3/15.
 */
public class StringUtil {

    /**
     * 判断字符串是否为null或者""
     * @param str
     * @return
     */
    public static boolean isNullOrEmpty(String str) {
        return null == str || "".equals(str);
    }
}
