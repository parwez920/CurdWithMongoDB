package com.example.dempo.model;

import lombok.Data;

@Data
public class RestResponse {
    private String msg = "ok";
    private Integer code = 200;
    private boolean status = true;
    private Object data;

    public RestResponse() {
    }

    public RestResponse(Object data) {
        this.data = data;
    }
}