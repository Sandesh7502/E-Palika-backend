package com.ePallika.sample.security;

import java.util.Collection;
import java.util.List;
//import javax.jws.soap.SOAPBinding.Use;
import com.ePallika.sample.login.model.Login;
import com.ePallika.sample.login.model.Status;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails{
    private static final long serialVersionUID = 1L;
    private String userName;
    private String password;
    private Status active;
    private List<?extends GrantedAuthority> authorities;
    private String roles;
    private Login user;

    public MyUserDetails(Login user,List<GrantedAuthority> grantedAuthorities) {
        this.userName = user.getUsername();
        this.password = user.getPassword();
        this.active = user.getStatus();
        this.authorities = grantedAuthorities;
        this.roles = user.getUserRole().getRoleName();
        this.user = user;
    }
    public MyUserDetails() {

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Login getUser() {
        return user;
    }
}
