/*
 * Copyright (c) 2018. 中南设计集团工程研究院. 版权所有者.
 * ProjectName: performance-util
 * FileName: ResultFormat.java
 * Date: 18-8-6 下午5:22
 * Version: 1.0.0
 * LastModified: 18-8-6 下午5:22
 */
package com.uking.mbpro.util;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Author: jaywoolly
 * Create: 2018-07-27
 * Description: 数据库操作返回结果
 */
public class ResultFormat {

    /*
     * 定义jackson对象
     */
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /*
     * 响应业务状态
     */
    private Integer resultCode;

    /*
     * 响应消息
     */
    private String resultMessage;

    /*
     * 响应中的数据
     */
    private Object resultData;

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    public ResultFormat(Integer c, String m, Object d) {
        this.resultCode = c;
        this.resultMessage = m;
        this.resultData = d;
    }

    public static ResultFormat build(Integer c, String m) {
        return new ResultFormat(c, m, null);
    }
}
