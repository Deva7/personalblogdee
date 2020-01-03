/*
package com.BlogForDevlin.service;

import com.BlogForDevlin.Entity.DAO.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.security.Permission;
import java.util.ArrayList;
import java.util.List;

*/
/**
 * @author Jinyl
 * @date 2019/10/30
 * @Mail Jinyl@mail.taiji.com.cn
 * @Describe:
 *//*

@Service
public class CustomUserService implements UserDetailsService {
    @Autowired
    org.springframework.security.core.userdetails.UserDetails userDao;
    @Autowired
    PermissionDao permissionDao;

    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) {
        UserDetails userDetails = userDao.findByUserName(username);
        if (user != null) {
            List<Permission> permissions = permissionDao.findByAdminUserId(user.getId());
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            for (Permission permission : permissions) {
                if (permission != null && permission.getName()!=null) {

                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getName());
                    //1：此处将权限信息添加到 GrantedAuthority 对象中，在后面进行全权限验证时会使用GrantedAuthority 对象。
                    grantedAuthorities.add(grantedAuthority);
                }
            }
            return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
        } else {
            throw new UsernameNotFoundException("admin: " + username + " do not exist!");
        }
    }
}
*/
