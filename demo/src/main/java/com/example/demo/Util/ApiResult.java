package com.example.demo.Util;

import io.swagger.annotations.ApiModelProperty;

public class ApiResult<T> {
    public ApiResult(int c,String m,T r)
    {
        code=c;
        message=m;
        result=r;
    }

    private int code;
    private String message;
    private T result;
    @ApiModelProperty("状态码:0成功，非0失败")
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    @ApiModelProperty("消息")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @ApiModelProperty("返回结果")
    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
