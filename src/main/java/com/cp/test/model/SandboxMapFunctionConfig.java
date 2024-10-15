/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.cp.test.model;

import java.io.Serializable;

/**
 * @author jc.cp
 * @version SandboxMapFunctionConfig.java, v 0.1 2023年11月22日 13:52 cp
 */
public class SandboxMapFunctionConfig implements Serializable {

    private static final long serialVersionUID = 741196143664224012L;

    private String            function;

    private String            resultCodeList;

    private String            paramAssembleConfig;

    private String            seq;

    /**
     * Getter method for property <tt>paramAssembleConfig</tt>.
     *
     * @return property value of paramAssembleConfig
     */
    public String getParamAssembleConfig() {
        return paramAssembleConfig;
    }

    /**
     * Setter method for property <tt>paramAssembleConfig</tt>.
     *
     * @param paramAssembleConfig value to be assigned to property paramAssembleConfig
     */
    public void setParamAssembleConfig(String paramAssembleConfig) {
        this.paramAssembleConfig = paramAssembleConfig;
    }

    /**
     * Getter method for property <tt>seq</tt>.
     *
     * @return property value of seq
     */
    public String getSeq() {
        return seq;
    }

    /**
     * Setter method for property <tt>seq</tt>.
     *
     * @param seq value to be assigned to property seq
     */
    public void setSeq(String seq) {
        this.seq = seq;
    }

    /**
     * Getter method for property <tt>function</tt>.
     *
     * @return property value of function
     */
    public String getFunction() {
        return function;
    }

    /**
     * Setter method for property <tt>function</tt>.
     *
     * @param function value to be assigned to property function
     */
    public void setFunction(String function) {
        this.function = function;
    }

    /**
     * Getter method for property <tt>resultCodeList</tt>.
     *
     * @return property value of resultCodeList
     */
    public String getResultCodeList() {
        return resultCodeList;
    }

    /**
     * Setter method for property <tt>resultCodeList</tt>.
     *
     * @param resultCodeList value to be assigned to property resultCodeList
     */
    public void setResultCodeList(String resultCodeList) {
        this.resultCodeList = resultCodeList;
    }
}