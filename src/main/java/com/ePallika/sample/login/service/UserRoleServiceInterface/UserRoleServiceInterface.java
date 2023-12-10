package com.ePallika.sample.login.service.UserRoleServiceInterface;


import com.ePallika.sample.login.model.Dto.LoginDto;
import com.ePallika.sample.login.model.Login;

public interface UserRoleServiceInterface {
    public Login saveUser(Login user);
    Login getByUser(String username);
    Login updateRole(LoginDto loginDto);

}
