/*
 * Copyright (c) 2018. 中南设计集团工程研究院. 版权所有者.
 * ProjectName: performance-service
 * FileName: MessageException.java
 * Date: 18-8-7 上午9:02
 * Version: 1.0.0
 * LastModified: 18-8-7 上午9:02
 */

package com.uking.mbpro.util;

import java.io.Serializable;

/**
 * Author: s1203017
 * Create: 2018-08-07
 * Description: 异常消息类
 */
public class MessageException extends Exception implements Serializable {

    public MessageException() {

    }

    public MessageException(String message) {
        super(message);
    }

    public MessageException(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageException(Throwable cause) {
        super(cause);
    }

    public MessageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
