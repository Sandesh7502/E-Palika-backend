package com.ePallika.sample.security;


import com.ePallika.sample.login.model.Login;
import com.ePallika.sample.login.repository.SecurityUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService  implements UserDetailsService {

    @Autowired
    private SecurityUserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Login user = userRepository.getUserByUsername(username);
        if (user!=null){
            return new MyUserDetails(user, mapRolesToAuthorities(user.getUserRole().getRoleName()));
        }
        return null;
    }

    private List<GrantedAuthority> mapRolesToAuthorities(String roles) {

        return Arrays.stream(roles.split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
}
