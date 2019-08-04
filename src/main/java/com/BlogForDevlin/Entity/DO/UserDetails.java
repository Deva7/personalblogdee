package com.BlogForDevlin.Entity.DO;

import lombok.Data;

import java.util.Date;

/**
 * @program: personalblog
 * @description: User_details table DO
 * @author: Devlin
 * @create: 2019-08-03 22:02
 **/
@Data
public class UserDetails {
    private Integer id;
    private Date gmtCreateTime;
    private Date gmtModifyTime;
    private String userName;
    private String userNickname;
    private Integer userPrivileges;
    private Integer userAge;
    private Integer userSex;
    private String userAddress;
    private String userPhone;
}
