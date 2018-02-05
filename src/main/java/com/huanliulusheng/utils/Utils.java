package com.huanliulusheng.utils;

/**
 * Created by zhangfeng on 2018/2/5.
 */
public class Utils {

    /**
     * 前补0
     *
     * @param seq
     * @param length
     * @return
     */
    public static String leftFillZero(String seq, int length) {
        StringBuffer sb = new StringBuffer();
        int mun = length - seq.length();
        if (mun > 0) {
            for (int i = 0; i < mun; i++) {
                sb.append("0");
            }
        }
        sb.append(seq);
        return sb.toString();
    }
}
