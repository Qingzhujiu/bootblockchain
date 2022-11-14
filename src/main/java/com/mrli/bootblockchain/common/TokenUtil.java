package com.mrli.bootblockchain.common;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.mrli.bootblockchain.domain.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

public class TokenUtil{

    /**
     * 生成token
     * @param user
     * @return
     */
    /*
    public static String generateToken(User user) {
        Date start = new Date();
        long currentTime = System.currentTimeMillis() + 60* 60 * 1000;//一小时有效时间
        Date end = new Date(currentTime);
        String token = "";

        token = JWT.create()
                .withClaim("userId",user.getUserId())
                .withClaim("userName",user.getUserName())
                .withClaim("userPassword",user.getUserPassword())
                .withClaim("userEmail",user.getUserEmail())
                .withIssuedAt(start)
                .withExpiresAt(end)
                .sign(Algorithm.HMAC256("tokenKey"));

        return token;
    }

    public static User parseToken(String token){
        // 创建解析对象，使用的算法和secret要与创建token时保持一致
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("tokenKey")).build();
        // 解析指定的token
        DecodedJWT decodedJWT = jwtVerifier.verify(token);
        // 获取解析后的token中的payload信息
        Claim userId = decodedJWT.getClaim("userId");
        Claim userName = decodedJWT.getClaim("userName");
        Claim userPassword = decodedJWT.getClaim("userPassword");
        Claim userEmail = decodedJWT.getClaim("userEmail");
        //封装数据
        User user = new User();
        user.setUserId(userId.asLong());
        user.setUserName(userName.asString());
        user.setUserPassword(userPassword.asString());
        user.setUserEmail(userEmail.asString());

        return user;
    }


     */

    /**
     *
     * @param token
     * @param key
     * @return userId
     * 获取制定token中某个属性值
     */
    public static String get(String token, String key) {
        List<String> list= JWT.decode(token).getAudience();
        String userId = JWT.decode(token).getAudience().get(0);
        return userId;
    }

    /**
     * 获取request
     * @return
     */
    public static HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        return requestAttributes == null ? null : requestAttributes.getRequest();
    }


    /**
     *
     * @param request
     * @return
     * 获取token
     */
    public static String getToken(HttpServletRequest request) {
        String token = request.getHeader("token");
        return token;
    }

}
