package com.ePallika.sample.user.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRelativeDto {

    private long id;

    private String relativeNameEng;

    private String relativeNameNep;

    private String relations;

    private long userId;
}
