package com.example.newspringboot;

import lombok.Data;

@Data
public class AjaxResponse {
    private boolean isok;
    private int code; //200.400.500
    private String message;
    private Object data;

    public AjaxResponse(){}

    public static AjaxResponse success(){
        AjaxResponse ajaxResponse= new AjaxResponse();
        ajaxResponse.setIsok(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("查询成功");
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }
}
