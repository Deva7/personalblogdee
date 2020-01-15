package com.BlogForDevlin.service;

import com.BlogForDevlin.Entity.DAO.RoleDetails;
import com.BlogForDevlin.Entity.DAO.UserDetails;
import com.BlogForDevlin.Mapper.DAO.PermissionDetailsMapper;
import com.BlogForDevlin.Mapper.DAO.RoleDetailsMapper;
import com.BlogForDevlin.Mapper.DAO.UserDetailsMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jinyl
 * @date 2019/10/30
 * @Mail Jinyl@mail.taiji.com.cn
 * @Describe:
 */

@Service
public class CustomUserService implements UserDetailsService {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserDetailsMapper userDetailsMapper;
    @Autowired
    RoleDetailsMapper roleDetailsMapper;
    @Autowired
    PermissionDetailsMapper permissionDetailsMapper;

    @Override
    public org.springframework.security.core.userdetails.User loadUserByUsername(String username) { //重写loadUserByUsername 方法获得 userdetails 类型用户

        logger.info("loadUserByUsername  userName={}", username);
        QueryWrapper<UserDetails> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name", username);
        UserDetails user = userDetailsMapper.selectOne(queryWrapper);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        //用于添加用户的权限。只要把用户权限添加到authorities 就万事大吉。
        RoleDetails roleDetails = roleDetailsMapper.selectById(user.getUserRole());
        authorities.add(new SimpleGrantedAuthority(roleDetails.getRoleName()));
        logger.info("roleInfo:{}" + roleDetails.getRoleName());

        return new org.springframework.security.core.userdetails.User(user.getUserName(),
                user.getPassword(), authorities);
    }
}
