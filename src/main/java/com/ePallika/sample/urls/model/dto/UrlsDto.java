package com.ePallika.sample.urls.model.dto;

import lombok.Data;

@Data
public class UrlsDto {

    private long id;


    private long municipalityId;

    private long districtId;

    private long provinceId;

    private String url;

}
