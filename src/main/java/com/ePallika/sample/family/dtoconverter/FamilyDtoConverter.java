package com.ePallika.sample.family.dtoconverter;

import com.ePallika.sample.family.model.Family;
import com.ePallika.sample.family.model.dto.FamilyDto;
import com.ePallika.sample.user.dtoconverter.UserDtoConverter;
import com.ePallika.sample.user.model.entity.User;

public class FamilyDtoConverter {

    public static FamilyDto convert(Family family){
        FamilyDto dto = new FamilyDto();
        dto.setId(family.getId());
        dto.setUserDto(UserDtoConverter.convert(family.getUser()));
        return dto;
    }

    public static Family convert(FamilyDto dto){
        Family family = new Family();
        family.setId(dto.getId());
        User user = new User();
        user.setId(dto.getUserId());
        return family;
    }
}
