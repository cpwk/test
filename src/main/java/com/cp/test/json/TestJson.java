package com.cp.test.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cp.test.模型.Artisan;
import com.cp.test.模型.Merchant;

/**
 * @author: jc.cp
 * @date: 2022/4/15 4:33 下午
 * @description: TODO
 **/
public class TestJson {
    public static void main(String[] args) {

        Artisan artisan = new Artisan();
        artisan.setCaseNum(1);
        String s = JSON.toJSONString(artisan);

        Merchant parseObject = JSONObject.parseObject(s, Merchant.class);

        System.out.println(parseObject.toString());
    }


}
