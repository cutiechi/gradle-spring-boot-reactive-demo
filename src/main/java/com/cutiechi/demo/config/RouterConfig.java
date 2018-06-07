package com.cutiechi.demo.config;

import com.cutiechi.demo.web.handler.UserHandler;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.http.MediaType.TEXT_PLAIN;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;


/**
 * 路由配置类
 *
 * @author Cutie Chi
 */
@Configuration
public class RouterConfig {

    /**
     * 用户路由
     *
     * @param userHandler 用户处理对象
     * @return 路由函数
     */
    @Bean
    public RouterFunction<ServerResponse> userRouter (@Autowired UserHandler userHandler) {
        return route(

            // 获取全部用户列表, API 为 GET 请求 /users
            GET("/users").and(accept(TEXT_PLAIN)),
            userHandler::listAll
        ).andRoute(

            // 添加用户, API 为 POST 请求 /users
            POST("/users").and(accept(APPLICATION_JSON)),
            userHandler::insert
        );
    }
}
