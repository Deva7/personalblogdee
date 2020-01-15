package com.BlogForDevlin.Entity.Custom;

import lombok.Data;

/**
 * @author Jinyl
 * @date 2020/1/15
 * @Mail Jinyl@mail.taiji.com.cn
 * @Describe:
 */
@Data
public class UserDTO {
    private String userName;

    private String nickName;

    private Integer userAge;

    private String url;

    private String password;
}
