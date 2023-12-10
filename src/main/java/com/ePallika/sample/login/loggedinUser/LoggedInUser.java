//package com.addon.cbps.security.loggedinUser;
//
//
//import com.addon.cbps.sec.security.CustomUserDetailsService;
//import com.addon.cbps.security.model.Login;
//import com.addon.cbps.security.repository.SecurityUserRepository;
//import com.addon.cbps.user.model.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class LoggedInUser {
////    @Autowired
////    static UserRepository userRepository;
//
//    @Autowired
//    static SecurityUserRepository securityUserRepository;
//
//    public User currentUser(){
//        CustomUserDetailsService customUserDetails = ((CustomUserDetailsService) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
//        Login login = securityUserRepository.getUserByUsername(customUserDetails.lo());
//        User user = login.getUser();
//        return user;
//    }
//}
