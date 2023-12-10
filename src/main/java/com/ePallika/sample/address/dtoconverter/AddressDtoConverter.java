package com.ePallika.sample.address.dtoconverter;

import com.ePallika.sample.address.model.dto.DistrictDto;
import com.ePallika.sample.address.model.dto.MunicipalityDto;
import com.ePallika.sample.address.model.dto.ProvinceDto;
import com.ePallika.sample.address.model.dto.WardDto;
import com.ePallika.sample.address.model.entity.District;
import com.ePallika.sample.address.model.entity.Municipality;
import com.ePallika.sample.address.model.entity.Province;
import com.ePallika.sample.address.model.entity.Ward;

public class AddressDtoConverter {

    public static DistrictDto convert(District entity) {

        DistrictDto dto = new DistrictDto();
        dto.setId(entity.getDistrictPK().getId());
        dto.setName(entity.getName());
        dto.setNameNep(dto.getNameNep());
        return dto;
    }

    public static MunicipalityDto convert(Municipality entity) {

        MunicipalityDto dto = new MunicipalityDto();
        dto.setId(entity.getMunicipalityPK().getId());
        dto.setName(entity.getName());
        dto.setNameNep(entity.getNameNep());
        return dto;
    }

    public static ProvinceDto convert(Province entity) {

        ProvinceDto dto = new ProvinceDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setNameNep(entity.getNameNep());
        return dto;
    }

    public static WardDto convert(Ward entity){
        WardDto dto = new WardDto();
        dto.setId(entity.getWardPK().getId());
        dto.setName(entity.getName());
        dto.setNameNep(entity.getNameNep());
        return dto;
    }
}
