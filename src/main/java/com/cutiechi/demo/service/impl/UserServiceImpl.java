package com.cutiechi.demo.service.impl;

import com.cutiechi.demo.model.entity.User;
import com.cutiechi.demo.repository.UserRepository;
import com.cutiechi.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

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
     * 获取全部用户列表
     *
     * @return userFlux
     */
    @Override
    public Flux<User> listAll () {
        return userRepository.findAll();
    }
}
