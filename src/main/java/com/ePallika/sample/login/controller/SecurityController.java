package com.ePallika.sample.login.controller;

import com.ePallika.sample.login.model.Status;
import com.ePallika.sample.login.model.Login;
import com.ePallika.sample.login.model.SendToken;
import com.ePallika.sample.login.repository.SecurityUserRepository;
import com.ePallika.sample.login.service.UserRoleServiceInterface.UserRoleServiceInterface;
import com.ePallika.sample.security.JWTGenerator;
import com.ePallika.sample.security.MyUserDetails;
import com.ePallika.sample.utils.ResponseMessage;
import com.ePallika.sample.utils.exceptions.SendErrorMessageCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/login")
public class SecurityController {

    private final AuthenticationManager authenticationManager;
    private final UserRoleServiceInterface userRoleServiceInterface;
    private final SecurityUserRepository securityUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final JWTGenerator jwtGenerator;

    @Autowired
    public SecurityController(
            AuthenticationManager authenticationManager,
            UserRoleServiceInterface userRoleServiceInterface,
            SecurityUserRepository securityUserRepository,
            BCryptPasswordEncoder bCryptPasswordEncoder,
            JWTGenerator jwtGenerator
    ) {
        this.authenticationManager = authenticationManager;
        this.userRoleServiceInterface = userRoleServiceInterface;
        this.securityUserRepository = securityUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public SendToken getToken(@RequestBody Login user) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.getUsername(),
                        user.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtGenerator.generateToken(authentication);

        Login login = securityUserRepository.getUserByUsername(user.getUsername());

        SendToken sendToken = new SendToken();
        if (login != null) {
            if (login.getStatus() == Status.disabled) {
                throw new SendErrorMessageCustom("Sorry! You have been disabled");
            }
            if (login.getStatus() == Status.unapproved) {
                throw new SendErrorMessageCustom("Sorry! You have not been approved yet");
            }

            sendToken.setUserRole(login.getUserRole().getRoleName());
            sendToken.setUsername(user.getUsername());
            sendToken.setId(login.getId());
            sendToken.setMessage("Successful");
            sendToken.setToken(token);
        }

        return sendToken;
    }
    @GetMapping("/check")
    public ResponseEntity<?> check() {
        return ResponseMessage.success();
    }

    @GetMapping("/loggedinuser")
    public ResponseEntity<?> getLoggedInUser() {
        Login user = ((MyUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser();
        return ResponseMessage.success(user);
    }
}
