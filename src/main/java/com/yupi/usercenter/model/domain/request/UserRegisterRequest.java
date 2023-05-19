package com.yupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zwj
 * @date 2023/05/04 14:05
 * 用户注册请求体
 **/
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -6746623028709562990L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;
}

