package com.cp.test.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author: jc.cp
 * @date: 2023/9/12 11:05
 * @desc: 识别码规则配置
 **/
public class AcCodeIdentityConfig implements Serializable {

    /**
     * 地区
     */
    private String            region;

    /**
     * routerType
     */
    private String            routerType;

    /**
     * userAgent
     */
    private String            userAgent;

    /**
     * Getter method for property <tt>region</tt>.
     *
     * @return property value of region
     */
    public String getRegion() {

        return region;
    }

    /**
     * Setter method for property <tt>region</tt>.
     *
     * @param region value to be assigned to property region
     */
    public void setRegion(String region) {

        this.region = region;
    }

    /**
     * Getter method for property <tt>routerType</tt>.
     *
     * @return property value of routerType
     */
    public String getRouterType() {

        return routerType;
    }

    /**
     * Setter method for property <tt>routerType</tt>.
     *
     * @param routerType value to be assigned to property routerType
     */
    public void setRouterType(String routerType) {

        this.routerType = routerType;
    }

    /**
     * Getter method for property <tt>userAgent</tt>.
     *
     * @return property value of userAgent
     */
    public String getUserAgent() {

        return userAgent;
    }

    /**
     * Setter method for property <tt>userAgent</tt>.
     *
     * @param userAgent value to be assigned to property userAgent
     */
    public void setUserAgent(String userAgent) {

        this.userAgent = userAgent;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);

    }
}
