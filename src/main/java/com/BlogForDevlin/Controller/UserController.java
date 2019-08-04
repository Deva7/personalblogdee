package com.BlogForDevlin.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: personalblog
 * @description: function about User
 * @author: Devlin
 * @create: 2019-08-03 22:34
 **/
@Controller
@Api(tags = "用户操作",description = "增，删，改，查，第三方",hidden = true)
@RequestMapping("/User")
public class UserController {
    /**
    * @Author: Devlin
    * @Description: User Init Function
    * @Param: [param, httpServletRequest]
    * @return: void
    * @Date: 2019-08-04
    */
    @ResponseBody
    @RequestMapping("/init")
    @ApiOperation(value="测试接口", notes="测试接口详细描述")
    public void UserInit(@ApiParam(required=true, name="name", value="姓名")@RequestBody String param, HttpServletRequest httpServletRequest){
        System.out.println(param);
    }
}
