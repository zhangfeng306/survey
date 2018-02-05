package com.huanliulusheng.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhangfeng on 2018/2/5.
 */
public class DateUtils {

    public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";


    public static final String YYYY_MM_DD = "yyyy-MM-dd";


    public static final String YYYYMMDD = "yyyyMMdd";
    /**
     * 获取具体时间
     * @param pattern
     * @return
     */
    public static String getDateTime(String pattern ) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);//可以方便地修改日期格式


        String dateTime = dateFormat.format(new Date());

        return dateTime;

    }
}
