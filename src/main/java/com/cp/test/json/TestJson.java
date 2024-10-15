package com.cp.test.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cp.test.model.Artisan;
import com.cp.test.model.Merchant;

/**
 * @author: jc.cp
 * @date: 2022/4/15 4:33 下午
 * @description: TODO
 **/
public class TestJson {
    /**
     * 主函数入口
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {

        // 创建一个工匠对象
        Artisan artisan = new Artisan();
        // 设置工匠编号为1
        artisan.setCaseNum(1);
        // 将工匠对象转换为JSON字符串
        String s = JSON.toJSONString(artisan);

        // 将JSON字符串转换为Merchant对象
        Merchant parseObject = JSONObject.parseObject(s, Merchant.class);

        // 打印Merchant对象的字符串表示形式
        System.out.println(parseObject.toString());
    }


}
