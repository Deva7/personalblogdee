package com.BlogForDevlin.Entity.DTO;

import lombok.Data;

/**
 * @program: personalblog
 * @description: User_details table DTO
 * @author: Devlin
 * @create: 2019-08-03 22:02
 **/
@Data
public class UserDTO {
    private String userName;
    private String userNickname;
    private Integer userPrivileges;
    private Integer userAge;
    private Integer userSex;
    private String userAddress;
    private String userPhone;
}
