package com.hw.util;

/**
 * @Author : hjs
 * @Description :
 * @Date : Created By 2020/11/24 17:03
 */
//@ApiModel(description = "返回的整个对象")
public class AjaxResult {

//    @ApiModelProperty(value = "是否成功")
    private boolean success = true;

//    @ApiModelProperty(value = "消息")
    private String message = "操作成功!";

    //返回到前台对象
//    @ApiModelProperty(value = "返回的具体对象")
    private Object resultObj;

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultObj() {
        return resultObj;
    }

    public AjaxResult setResultObj(Object resultObj) {
        this.resultObj = resultObj;
        return this;
    }

    //AjaxResult.me()成功
    //AjaxResult.me().setMessage()成功
    //AjaxResult.me().setSuccess(false),setMessage("失败");
    public  static AjaxResult me(){
        return new AjaxResult();
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", resultObj=" + resultObj +
                '}';
    }
}
