package org.demo.springboot.domain.service.signin;

import java.util.List;

import org.demo.springboot.domain.dbflute.exbhv.UserBhv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserSigninLogic implements UserDetailsService {

    @Autowired
    public UserBhv userBhv;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final var optUser = userBhv.selectEntity(cb -> {
            cb.specify().columnUserName();
            cb.specify().columnPassword();
            cb.query().setUserName_Equal(username);
        });
        if (optUser.isPresent()) {
            final var grantList = List.of(new SimpleGrantedAuthority("USER"));
            final var user = optUser.get();
            // TODO cistus encrypt password when user created (Jun 18, 2020)
            final var encoder = new BCryptPasswordEncoder();
            return new User(user.getUserName(), encoder.encode(user.getPassword()), grantList);
        } else {
            throw new UsernameNotFoundException("User " + username + " was not found");
        }
    }
}
