package com.cp.test.模型;

import java.util.List;

/**
 * 创建人:CP
 * 创建时间:2020/6/1 2:49 下午
 * 项目名称:ysmz-api
 **/
public class Merchant {

    private Long id;
    private String name;
    private String phone;
    private Long createdAt ;

    /**
     * 平台使用费率
     */
    private Integer rate ;

    /**
     * 状态：1.正常2.封禁3.欠费
     */
    private Byte state;

    private String logo;

    /**
     * 商品分类编码
     */
    private List<String> productCategorySequences;

    /**
     * 有效期
     */
    private Long validThru;

    /**
     * 总收益
     */
    private Integer totalPurchases;

    /**
     * 店铺位置信息
     */
    private Integer balance;

    @Override
    public String toString() {
        return "JSON.Merchant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", createdAt=" + createdAt +
                ", rate=" + rate +
                ", state=" + state +
                ", logo='" + logo + '\'' +
                ", productCategorySequences=" + productCategorySequences +
                ", validThru=" + validThru +
                ", totalPurchases=" + totalPurchases +
                ", balance=" + balance +
                '}';
    }

}
