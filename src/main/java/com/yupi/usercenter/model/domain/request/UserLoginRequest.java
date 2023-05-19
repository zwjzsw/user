package com.yupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zwj
 * @date 2023/05/04 14:05
 * 用户登录请求体
 **/
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -6746623028709562990L;

    private String userAccount;

    private String userPassword;

}

