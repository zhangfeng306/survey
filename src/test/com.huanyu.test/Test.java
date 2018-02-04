package com.huanyu.test;

import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<String, String>();
        map.put("A1","1");
        map.put("A2","2");
        JSONObject json = new JSONObject();
        json.accumulateAll(map);
        System.out.println(json.toString());
    }
}
