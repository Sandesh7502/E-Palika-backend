package com.ePallika.sample.user.service;

import com.ePallika.sample.login.model.Status;
import com.ePallika.sample.user.model.dto.UserDto;
import com.ePallika.sample.user.model.dto.UserRegisterDto;
import com.ePallika.sample.user.model.entity.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserServiceInterface {
    User saveUser(UserDto dto);

    UserRegisterDto saveUserDetails(UserRegisterDto dto);

    Page<UserRegisterDto> getAllUser(int offset, int page);

    UserRegisterDto getById(long id);

    UserRegisterDto changeStatus(Status status, long id);

    UserRegisterDto changeRole(long userId, long roleId);

    List<User> getUserOption(String user);


}
