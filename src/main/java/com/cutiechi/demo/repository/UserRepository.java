package com.cutiechi.demo.repository;

import com.cutiechi.demo.model.entity.User;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * 用户数据仓库接口
 *
 * @author Cutie Chi
 */
public interface UserRepository extends ReactiveMongoRepository<User, String> {

}
