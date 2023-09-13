package com.cp.test.aop;

/**
 * @author: jc.cp
 * @date: 2022/11/7 15:36
 * @desc: TODO
 **/
public enum NodeEnum {

    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    ;

    NodeEnum(String desc) {
        this.desc = desc;
    }

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
