package com.huanliulusheng.utils;

import org.apache.commons.lang.StringUtils;

import java.util.Random;
import java.util.UUID;

/**
 * Created by zhangfeng on 2018/2/5.
 */
public class UUIDUtils {

    public static Random random = new Random();

    /**
     * 生成UUID主键
     * @return
     */
    public static String generateUUID(){
        return (DateUtils.getDateTime(DateUtils.YYYYMMDDHHMMSS)+ randomUUID());
    }

    /**
     * 生成32UUID主键
     * @return
     */
    public static String generateUUID32(){

        String value = Utils.leftFillZero(String.valueOf(random.nextInt(100)),6);
        return (DateUtils.getDateTime(DateUtils.YYYYMMDDHHMMSS)+ value);
    }


    public static String randomUUID(){
        String uuid = UUID.randomUUID().toString();
        return StringUtils.remove(uuid,"-");
    }

    public static void main(String[] args) {
        System.out.print(generateUUID32());

    }
}
