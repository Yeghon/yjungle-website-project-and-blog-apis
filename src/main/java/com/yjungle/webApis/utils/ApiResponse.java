package com.yjungle.webApis.utils;

/*
 * Created on 9/16/20
 * Author YeghonHaron
 */
public class ApiResponse {

    private String responseCode;

    private String responseMessage;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
