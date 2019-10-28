package com.BlogForDevlin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @program: personalblog
 * @description: test all type of function.
 * @author: Devlin
 * @create: 2019-08-23 22:08
 **/
@Controller
@Api(tags = "Test", description = "Test For All,Hope it work!", hidden = true)
@RequestMapping("/Test")
public class TestForAll {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @GetMapping
    public String getUsers() {
        return "Hello Spring Security";
    }

    /**
     * @Author: Devlin
     * @Description: test redis connect
     * @Param: [userDTO, httpServletRequest]
     * @return: void
     * @Date: 2019-08-23
     */
    @ResponseBody
    @RequestMapping(value = "/redisConnect", method = GET)
    @ApiOperation(value = "testRedis", notes = "redis connect and value get")
    public void UserInit(HttpServletRequest httpServletRequest) {

        stringRedisTemplate.opsForValue().set("name", "123123");
        String str = stringRedisTemplate.opsForValue().get("name");

        System.out.println("Redis key 'name' value is: " + str);
    }
}
