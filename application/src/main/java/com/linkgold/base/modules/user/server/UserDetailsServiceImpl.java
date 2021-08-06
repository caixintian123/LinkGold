package com.linkgold.base.modules.user.server;

import com.linkgold.base.modules.user.model.UserDetail;
import com.linkgold.base.modules.user.model.UserEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return getUserByUserName(s);
    }

    private UserDetail getUserByUserName(String s) {
        UserEntity entity = new UserEntity();
        entity.setUsername("admin");
        entity.setPassword("admin");

        if (entity == null){
            throw new UsernameNotFoundException("空");
        }

        return new UserDetail(entity, Collections.emptyList());
    }
}
