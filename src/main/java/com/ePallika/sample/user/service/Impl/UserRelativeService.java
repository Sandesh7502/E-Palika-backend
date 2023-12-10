package com.ePallika.sample.user.service.Impl;

import com.ePallika.sample.user.dtoconverter.UserDtoConverter;
import com.ePallika.sample.user.model.dto.UserRelativeDto;
import com.ePallika.sample.user.model.entity.UserRelative;
import com.ePallika.sample.user.repository.UserRelativeRepository;
import com.ePallika.sample.user.service.UserRelativeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserRelativeService implements UserRelativeServiceInterface {

    @Autowired
    UserRelativeRepository repo;

    public UserRelative saveUserRelative(UserRelativeDto dto){
        return repo.save(UserDtoConverter.convert(dto));
    }

}
