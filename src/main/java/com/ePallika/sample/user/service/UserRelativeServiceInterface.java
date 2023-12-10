package com.ePallika.sample.user.service;

import com.ePallika.sample.user.model.dto.UserRelativeDto;
import com.ePallika.sample.user.model.entity.UserRelative;

public interface UserRelativeServiceInterface {

    UserRelative saveUserRelative(UserRelativeDto dto);
}
