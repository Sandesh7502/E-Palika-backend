package com.ePallika.sample.user.model.dto;

import com.ePallika.sample.address.model.dto.DistrictDto;
import com.ePallika.sample.address.model.dto.MunicipalityDto;
import com.ePallika.sample.address.model.dto.ProvinceDto;
import com.ePallika.sample.address.model.dto.WardDto;
import com.ePallika.sample.user.model.entity.UserAddressType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddressDetail {
    private long id;

    private WardDto ward;
    private MunicipalityDto municipality;
    private DistrictDto district;
    private ProvinceDto province;
    private String toleNep;
    private String toleEng;

    private UserAddressType type;
}
