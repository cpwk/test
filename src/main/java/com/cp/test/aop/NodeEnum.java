package com.cp.test.aop;


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
