package com.mrli.bootblockchain.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用返回结果，服务端响应的数据最终都会封装成此对象
 * @param <T>
 */
@Data
public class R<T> {

    private Integer code; //编码：1成功，0和其它数字为失败

    private String token;

    private String msg; //错误信息

    private T data; //数据

    private Map map = new HashMap(); //动态数据

    /**
     *
     * @param object 返回的类型 可以是String 或实体类
     * @param statusCode  状态码 成功返回1  若有其他需求也可为其他
     * @return
     * @param <T>
     */
    public static <T> R<T> success(T object,int statusCode) {
        R<T> r = new R<T>();
        r.data = object;
        r.code = statusCode;
        return r;
    }

    public static <T> R<T> returnToken(int statusCode,String token,T object){
        R<T> r = new R<T>();
        r.code = statusCode;
        r.token = token;
        r.data = object;
        return r;
    }

    public static <T> R<T> error(String msg,int statusCode) {
        R r = new R();
        r.msg = msg;
        r.code = statusCode;
        return r;
    }

    public R<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }



}
