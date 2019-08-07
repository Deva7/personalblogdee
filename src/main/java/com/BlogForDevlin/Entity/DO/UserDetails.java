package com.BlogForDevlin.Entity.DO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @program: personalblog
 * @description: User_details table DO
 * @author: Devlin
 * @create: 2019-08-03 22:02
 **/
@Data
@TableName("user_details")
public class UserDetails {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Date gmtCreatetime;
    private Date gmtModifytime;
    private String userName;
    private String userNickname;
    private Integer userPrivileges;
    private Integer userAge;
    private Integer userSex;
    private String userAddress;
    private String userPhone;
}
