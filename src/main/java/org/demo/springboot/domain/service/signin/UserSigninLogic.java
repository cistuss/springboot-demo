package org.demo.springboot.domain.service.signin;

import org.demo.springboot.domain.dbflute.exbhv.UserBhv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserSigninLogic implements UserDetailsService {

    @Autowired
    public UserBhv userBhv;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        userBhv.selectEntity(cb -> {
            cb.specify().columnUserName();
            cb.query().setUserName_Equal(username);
        });
        return null;
    }
}
