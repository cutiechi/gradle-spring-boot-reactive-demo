package com.cutiechi.demo.service.impl;

import com.cutiechi.demo.model.entity.User;
import com.cutiechi.demo.repository.UserRepository;
import com.cutiechi.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 用户业务逻辑实现类
 *
 * @author Cutie Chi
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 用户数据仓库对象
     */
    private final UserRepository userRepository;

    /**
     * Spring 自动注入
     *
     * @param userRepository 用户数据仓库对象
     */
    @Autowired
    public UserServiceImpl (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * 添加用户
     *
     * @param user 用户
     * @return 用户 Mono
     */
    @Override
    public Mono<User> insert (final User user) {
        return userRepository.save(user);
    }

    /**
     * 获取全部用户列表
     *
     * @return userFlux
     */
    @Override
    public Flux<User> listAll () {
        return userRepository.findAll();
    }

    /**
     * 根据用户 ID 获取用户
     *
     * @param userId 用户 ID
     * @return 用户 Mono
     */
    @Override
    public Mono<User> getById (String userId) {
        return userRepository.findById(userId);
    }
}
