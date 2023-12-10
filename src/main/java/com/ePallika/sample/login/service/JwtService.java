//package com.addon.cbps.security.service;
//
//
//
//import com.addon.cbps.security.customuser.CustomUserDetails;
//import com.addon.cbps.security.model.Login;
//import com.addon.cbps.security.repository.SecurityUserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class JwtService implements UserDetailsService{
//    @Autowired
//    private SecurityUserRepository userInterface;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Login user =userInterface.getUserByUsername(username);
//        CustomUserDetails customUserDetails = new CustomUserDetails(user);
//        return customUserDetails;
//    }
//}
