package com.ePallika.sample.urls.model.dto;

import com.ePallika.sample.address.model.dto.DistrictDto;
import com.ePallika.sample.address.model.dto.MunicipalityDto;
import com.ePallika.sample.address.model.dto.ProvinceDto;
import lombok.Data;

@Data
public class UrlsSendDto {

    private long id;
    private MunicipalityDto municipality;
    private DistrictDto district;
    private ProvinceDto province;
    private String url;
}
