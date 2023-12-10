package com.ePallika.sample.urls.dtoconverter;

import com.ePallika.sample.address.model.dto.DistrictDto;
import com.ePallika.sample.address.model.dto.MunicipalityDto;
import com.ePallika.sample.address.model.dto.ProvinceDto;
import com.ePallika.sample.address.model.entity.District;
import com.ePallika.sample.address.model.entity.Municipality;
import com.ePallika.sample.address.model.entity.Province;
import com.ePallika.sample.address.model.pk.DistrictPK;
import com.ePallika.sample.address.model.pk.MunicipalityPK;
import com.ePallika.sample.urls.model.dto.UrlsDto;
import com.ePallika.sample.urls.model.dto.UrlsSendDto;
import com.ePallika.sample.urls.model.entity.Urls;

public class UrlDtoConverter {

    public static Urls convert(UrlsDto dto) {

        Province province = new Province();
        province.setId(dto.getProvinceId());

        DistrictPK districtPK = new DistrictPK();
        districtPK.setId(dto.getDistrictId());
        districtPK.setProvince(province);

        District district = new District();
        district.setDistrictPK(districtPK);

        MunicipalityPK municipalityPK = new MunicipalityPK();
        municipalityPK.setDistrict(district);
        municipalityPK.setId(dto.getMunicipalityId());

        Municipality municipality = new Municipality();
        municipality.setMunicipalityPK(municipalityPK);

//        WardPK wardPK = new WardPK();
//        wardPK.setId(dto.getWardId());
//        wardPK.setMunicipality(municipality);
//
//        Ward ward = new Ward();
//        ward.setWardPK(wardPK);


        Urls entity = new Urls();
        entity.setMunicipality(municipality);
        entity.setUrl(dto.getUrl());
        return entity;
    }

    public static UrlsSendDto convert(Urls entity) {

        ProvinceDto province = new ProvinceDto();
        province.setId(entity.getMunicipality().getMunicipalityPK().getDistrict().getDistrictPK()
                .getProvince().getId());
        province.setName(entity.getMunicipality().getMunicipalityPK().getDistrict()
                .getDistrictPK().getProvince().getName());

        DistrictDto district = new DistrictDto();
        district.setId(entity.getMunicipality().getMunicipalityPK().getDistrict().getDistrictPK()
                .getId());
        district.setName(entity.getMunicipality().getMunicipalityPK().getDistrict().getName());

        MunicipalityDto municipality = new MunicipalityDto();
        municipality.setId(entity.getMunicipality().getMunicipalityPK().getId());
        municipality.setName(entity.getMunicipality().getName());

//        WardDto ward = new WardDto();
//        ward.setId(entity.getWard().getWardPK().getId());
//        ward.setName(entity.getWard().getName());

        UrlsSendDto dto = new UrlsSendDto();
        dto.setId(entity.getId());
        dto.setProvince(province);
        dto.setDistrict(district);
        dto.setMunicipality(municipality);
        dto.setUrl(entity.getUrl());
        return dto;
    }
}
