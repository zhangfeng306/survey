package com.huanyu.common.bean;

import java.io.Serializable;

/**
 * 返回响应类
 * 
 * @author zhangfeng
 */
public class ResponseVo implements Serializable
{
    
    private static final long serialVersionUID = 1L;
    
    /** 返回码 */
    private String respCode;
    
    /** 返回码描述 */
    private String respMessage;
    
    /** 业务返回信息 ：里面为返回的json字符串，包含返回业务返回消息 */
    private Object content;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMessage() {
        return respMessage;
    }

    public void setRespMessage(String respMessage) {
        this.respMessage = respMessage;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public ResponseVo(String respCode, String respMessage, Object content) {
        this.respCode = respCode;
        this.respMessage = respMessage;
        this.content = content;
    }

    public ResponseVo() {
    }
}
