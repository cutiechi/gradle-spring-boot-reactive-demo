package com.cutiechi.demo.service;

import com.cutiechi.demo.model.entity.User;
import reactor.core.publisher.Flux;

/**
 * 用户业务逻辑接口
 *
 * @author Cutie Chi
 */
public interface UserService {

    /**
     * 获取全部用户列表
     *
     * @return userFlux
     */
    Flux<User> listAll ();
}
