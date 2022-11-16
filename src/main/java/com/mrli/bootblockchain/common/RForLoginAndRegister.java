package com.mrli.bootblockchain.common;

public class RForLoginAndRegister extends R{
    private Integer code;
    private String token;
    private String message;

    public static RForLoginAndRegister error(String msg, int statusCode, String token) {
        RForLoginAndRegister r = new RForLoginAndRegister();
        r.token = token;
        r.message = msg;
        r.code = statusCode;
        return r;
    }


    public static RForLoginAndRegister success(String msg, int statusCode, String token) {
        RForLoginAndRegister r = new RForLoginAndRegister();
        r.token = token;
        r.message = msg;
        r.code = statusCode;
        return r;
    }

}
