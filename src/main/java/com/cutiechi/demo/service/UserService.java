package com.cutiechi.demo.service;

import com.cutiechi.demo.model.entity.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 用户业务逻辑接口
 *
 * @author Cutie Chi
 */
public interface UserService {

    /**
     * 添加用户
     *
     * @param user 用户
     * @return 用户 Mono
     */
    Mono<User> insert (User user);

    /**
     * 获取全部用户列表
     *
     * @return userFlux
     */
    Flux<User> listAll ();

    /**
     * 根据用户 ID 获取用户
     *
     * @param userId 用户 ID
     * @return 用户 Mono
     */
    Mono<User> getById (final String userId);
}
