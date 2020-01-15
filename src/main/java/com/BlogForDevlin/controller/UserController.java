package com.BlogForDevlin.controller;

import com.BlogForDevlin.Entity.Custom.UserDTO;
import com.BlogForDevlin.Entity.DAO.UserDetails;
import com.BlogForDevlin.Mapper.DAO.UserDetailsMapper;
import com.BlogForDevlin.utils.BeanUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @program: personalblog
 * @description: function about User
 * @author: Devlin
 * @create: 2019-08-03 22:34
 **/
@Controller
@Api(tags = "用户操作", description = "增，删，改，查，第三方", hidden = true)
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserDetailsMapper userMapper;

    private static final Logger logger= LoggerFactory.getLogger(UserController.class);
    /**
     * @Author: Devlin
     * @Description: User Init Function
     * @Param: [param, httpServletRequest]
     * @return: void
     * @Date: 2019-08-04
     */
    @ResponseBody
    @RequestMapping(value = "/init", method = POST)
    @ApiOperation(value = "测试接口", notes = "测试接口详细描述")
    public void UserInit(@ApiParam(required = true, name = "name", value = "姓名") @RequestBody UserDTO userDTO, HttpServletRequest httpServletRequest) {
        UserDetails userDetails=new UserDetails();
        try {
            BeanUtils.CopySameBean(userDTO,userDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int count = userMapper.insert(userDetails);

        System.out.println(count + "?" + userDTO);
    }

    /**
     * @Author: Devlin
     * @Description:
     * @Param: [userDetails, httpServletRequest]
     * @return: void
     * @Date: 2019-08-08
     */
    @ResponseBody
    @RequestMapping(value = "/initTest", method = POST)
    @ApiOperation(value = "测试接口", notes = "测试接口详细描述")
    public void initTest(@ApiParam(required = true, name = "name", value = "姓名") @RequestBody UserDetails userDetails, HttpServletRequest httpServletRequest) {
        int count = userMapper.insert(userDetails);
        System.out.println(count + "?" + userDetails);
    }
}
