package com.linkgold.base.modules.user.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class UserDetail extends User {

    private UserEntity entity;


    public UserDetail(UserEntity entity, Collection<? extends GrantedAuthority> authorities) {
        super(entity.getUsername(), entity.getPassword(), authorities);
    }
}
