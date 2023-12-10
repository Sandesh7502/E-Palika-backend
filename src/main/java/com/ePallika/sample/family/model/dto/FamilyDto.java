package com.ePallika.sample.family.model.dto;

import com.ePallika.sample.user.model.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FamilyDto {
    private int id;

    private UserDto userDto;

    private long userId;
}
