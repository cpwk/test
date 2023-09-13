package com.cp.test.模型;

import lombok.Data;

/**
 * 创建人:CP
 * 创建时间:2020/6/1 2:49 下午
 * 项目名称:ysmz-api
 * 设计师&&工人
 **/
@Data
public class Artisan {

    private Long id;
    private String name;
    private String mobile;
    private String identity;
    private Long createdAt = System.currentTimeMillis();
    private Integer caseNum = 0;
    private String deviceId;
    private String password;

    /**
     * 工种：1.设计师2.水电工3.瓦工4.美缝5.木工6.防水7.油漆工8.垃圾清运9.砸墙10.封阳台11.保洁12.打孔
     */
    private Byte type;

    /**
     * 工龄
     */
    private Byte years = 0;

    /**
     * 审核状态：1.待审核2.已审核3.审核未通过4.已封禁
     */
    private Byte status;

    /**
     * 最近登录时间
     */
    private Long signinAt;
    /**
     * 报价或工价
     */
    private String price;

    /**
     * 粉丝数
     */
    private Integer starNum = 0;
    /**
     * 设计师服务范围
     */
    private String serviceArea;
    /**
     * 性别：1.男2.女
     */
    private Byte sex;
    /**
     * 今日收益
     */
    private Integer todayRevenue;
    /**
     * 信用积分
     */
    private Float creditScore = 5.0F;
    /**
     * 设计师的所有案例和图集被收藏的总数
     */
    private Integer countStar = 0;
    /**
     * 工人成长值
     */
    private Integer growthValue = 0;

}