package com.cutiechi.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 用户
 *
 * @author Cutie Chi
 */
@AllArgsConstructor
@Data
@Document
@NoArgsConstructor
@RequiredArgsConstructor
public class User {

    /**
     * 用户 ID
     */
    @Id
    private String userId;

    /**
     * 用户名称
     */
    @NonNull
    private String userName;

    /**
     * 用户密码
     */
    @NonNull
    private String userPassword;
}
