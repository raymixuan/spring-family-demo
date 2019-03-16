package cn.oldriver.entity.vo;

import java.io.Serializable;

/**
 * @Author kejx
 * @Date 2019/3/16 14:31
 */
public class ResponseVO<T> implements Serializable {

    private String code;

    private String msg;

    private T obj;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "ResponseBO{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                '}';
    }
}
