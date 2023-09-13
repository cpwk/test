package com.cp.test.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author: jc.cp
 * @date: 2023/6/28 15:07
 * @desc: TODO
 **/
public class Test {
    public static void main(String[] args) {
        String s="{\"code\":\"200\",\"data\":{\"address\":{\"formattedAddress\":\"广东省深圳市福田区福田街道\",\"latitude\":22.524654,\"longitude\":114.064939},\"success\":true},\"id\":\"20230628150029517IQhu7zWk\",\"success\":true}";
        JSONObject jsonObject = JSON.parseObject(s);
        System.out.println("jsonObject = " + jsonObject);
        Object success = jsonObject.get("success");
        System.out.println("success = " + success);
        JSONObject data = JSON.parseObject(String.valueOf(jsonObject.get("data")));
        JSONObject address = JSON.parseObject(String.valueOf(data.get("address")));
        System.out.println("address = " + address);
        Object formattedAddress = address.get("formattedAddress");
        System.out.println("formattedAddress = " + formattedAddress);
        Object latitude = address.get("latitude");
        System.out.println("latitude = " + latitude);
        Object longitude = address.get("longitude");
        System.out.println("longitude = " + longitude);
    }
}
