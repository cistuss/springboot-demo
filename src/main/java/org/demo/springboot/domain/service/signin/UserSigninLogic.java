package org.demo.springboot.domain.service.signin;

import java.util.List;

import org.demo.springboot.app.common.security.LoggedUser;
import org.demo.springboot.domain.dbflute.exbhv.UserBhv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserSigninLogic implements UserDetailsService {

    @Autowired
    private UserBhv userBhv;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final var user = userBhv.selectEntity(cb -> {
            cb.specify().columnUserName();
            cb.specify().columnPassword();
            cb.query().setUserName_Equal(username);
        });
        if (user.isPresent()) {
            final var grantList = List.of(new SimpleGrantedAuthority("USER"));
            return new LoggedUser(user.get(), grantList);
        } else {
            throw new UsernameNotFoundException("User " + username + " was not found");
        }
    }
}
