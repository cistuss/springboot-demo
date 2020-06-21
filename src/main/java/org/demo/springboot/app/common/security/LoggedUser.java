package org.demo.springboot.app.common.security;

import java.util.Collection;

import org.demo.springboot.domain.dbflute.exentity.User;
import org.springframework.security.core.GrantedAuthority;

/**
 * Logged in user
 * 
 * @author cistus
 */
public class LoggedUser extends org.springframework.security.core.userdetails.User {

    /** serialize UID */
    private static final long serialVersionUID = 1L;

    private final Integer userId;

    public LoggedUser(User user, Collection<? extends GrantedAuthority> authority) {
        super(user.getUserName(), user.getPassword(), authority);
        this.userId = user.getUserId();
    }

    public Integer getUserId() {
        return userId;
    }
}
