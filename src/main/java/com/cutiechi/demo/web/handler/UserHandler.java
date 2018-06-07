package com.cutiechi.demo.web.handler;

import com.cutiechi.demo.model.entity.User;
import com.cutiechi.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

/**
 * 用户处理类
 *
 * @author Cutie Chi
 */
@Component
public final class UserHandler {

    /**
     * 用户业务逻辑对象
     */
    private final UserService userService;

    /**
     * Spring 自动注入
     *
     * @param userService 用户业务逻辑对象
     */
    @Autowired
    public UserHandler (final UserService userService) {
        this.userService = userService;
    }

    /**
     * 获取全部用户列表
     *
     * @param request 请求
     * @return 响应
     */
    public Mono<ServerResponse> listAll (final ServerRequest request) {
        return ServerResponse
            .ok()
            .body(userService.listAll(), User.class);
    }
}
