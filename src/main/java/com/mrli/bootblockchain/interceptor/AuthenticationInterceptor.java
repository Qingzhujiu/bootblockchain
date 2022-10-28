package com.mrli.bootblockchain.interceptor;

import com.mrli.bootblockchain.common.TokenUtil;
import com.mrli.bootblockchain.domain.User;
import com.mrli.bootblockchain.service.UserService;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationInterceptor implements HandlerInterceptor {

    @Resource
    private UserService userService;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
//        查看请求中是否存在token，如果不存在直接跳转到登陆页面
        String token = TokenUtil.getToken(request);
        if (StringUtils.isEmpty(token)) {
            return false;
        }else{
            User user = TokenUtil.parseToken(token);
            User searchedUser = userService.getById(user.getUserId());
            System.out.println("用户已经登录过："+searchedUser);
            if (searchedUser == null){
                return false;
            }
        }
        return true;
    }

}
