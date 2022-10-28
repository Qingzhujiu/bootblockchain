package com.mrli.bootblockchain.config;

import com.mrli.bootblockchain.interceptor.AuthenticationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 静态资源映射
     * @param registry
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor())
//                表示拦截所有请求
                .addPathPatterns("/**")
//                表示取消对特定路径的拦截
                .excludePathPatterns("/home")
                .excludePathPatterns("/user/**")
//                .excludePathPatterns("/user/userLogin")
//                这里一定不要写成/**/*.js的形式，spring boot无法识别
//                取消对static目录下静态资源的拦截
                .excludePathPatterns("/static/**");
    }

    @Bean
    public AuthenticationInterceptor authenticationInterceptor() {
        return new AuthenticationInterceptor();
    }


}
