package com.ePallika.sample.user.dtoconverter;

import com.ePallika.sample.address.model.dto.DistrictDto;
import com.ePallika.sample.address.model.dto.MunicipalityDto;
import com.ePallika.sample.address.model.dto.ProvinceDto;
import com.ePallika.sample.address.model.dto.WardDto;
import com.ePallika.sample.address.model.entity.District;
import com.ePallika.sample.address.model.entity.Municipality;
import com.ePallika.sample.address.model.entity.Province;
import com.ePallika.sample.address.model.entity.Ward;
import com.ePallika.sample.address.model.pk.DistrictPK;
import com.ePallika.sample.address.model.pk.MunicipalityPK;
import com.ePallika.sample.address.model.pk.WardPK;
import com.ePallika.sample.login.model.Dto.LoginDto;
import com.ePallika.sample.login.model.Login;
import com.cssewa.sample.user.model.dto.*;
import com.ePallika.sample.user.model.entity.User;
import com.ePallika.sample.user.model.entity.UserAddress;
import com.ePallika.sample.user.model.entity.UserDocument;
import com.ePallika.sample.user.model.entity.UserRelative;
import com.ePallika.sample.user.model.dto.*;

import java.util.List;
import java.util.stream.Collectors;

public class UserDtoConverter {


        public static UserDto convert(User entity){
            UserDto dto = new UserDto();
            dto.setEmail(entity.getEmail());
            dto.setGender(entity.getGender());
            dto.setId(entity.getId());
            dto.setMaritalStatus(entity.getMaritalStatus());
            dto.setPhotoName(entity.getPhotoName());
            dto.setNameNep(entity.getNameNep());
            dto.setNameEng(entity.getNameEng());
            dto.setPhoneNo(entity.getPhoneNo());
            dto.setId(entity.getId());
            return dto;
        }

        public static User convert(UserDto dto){
            User entity = new User();
            entity.setEmail(dto.getEmail());
            entity.setGender(dto.getGender());
            entity.setPhoneNo(dto.getPhoneNo());
            entity.setMaritalStatus(dto.getMaritalStatus());
            entity.setEmail(dto.getEmail());
            entity.setNameEng(dto.getNameEng());
            entity.setNameNep(dto.getNameNep());
            entity.setPhotoName(dto.getPhotoName());
            return entity;

        }

        public static UserDocument convert(UserDocumentDto dto){
            UserDocument entity = new UserDocument();
            entity.setIdentityNo(dto.getIdentityNo());
            entity.setIssuedPlace(dto.getIssuedPlace());
            entity.setIssueDate(dto.getIssueDate());
            entity.setFilename(dto.getFilename());
            entity.setDocumentType(dto.getDocumentType());
            if (dto.getUserId()!=0){
                User user = new User();
                user.setId(dto.getUserId());
            }
            return entity;

        }

        public static UserDocumentDto convert(UserDocument entity){
            UserDocumentDto dto = new UserDocumentDto();
            dto.setId(entity.getId());
            dto.setFilename(entity.getFilename());
            dto.setIdentityNo(entity.getIdentityNo());
            dto.setIssueDate(entity.getIssueDate());
            dto.setFilename(entity.getFilename());
            dto.setIssuedPlace(entity.getIssuedPlace());
            dto.setUserId(entity.getUser().getId());
            dto.setDocumentType(entity.getDocumentType());
            return dto;
        }

        public static UserRelative convert(UserRelativeDto dto){
            UserRelative entity = new UserRelative();
            entity.setRelations(dto.getRelations());
            entity.setRelativeNameEng(dto.getRelativeNameEng());
            entity.setRelativeNameNep(dto.getRelativeNameNep());
            if (dto.getUserId()!=0) {
                User user = new User();
                user.setId(dto.getUserId());
                entity.setUser(user);
            }
            return entity;
        }

        public static UserRelativeDto convert(UserRelative entity){
            UserRelativeDto dto = new UserRelativeDto();
            dto.setId(entity.getId());
            dto.setRelations(entity.getRelations());
            dto.setRelativeNameEng(entity.getRelativeNameEng());
            dto.setRelativeNameNep(entity.getRelativeNameNep());
            dto.setUserId(entity.getUser().getId());
            return dto;
        }

        public static UserAddressDto convert(UserAddress entity) {
            UserAddressDto dto = new UserAddressDto();
            dto.setId(entity.getId());
            dto.setWardId(entity.getWard().getWardPK().getId());
            dto.setMunicipalityId(entity.getWard().getWardPK().getMunicipality().getMunicipalityPK().getId());
            dto.setDistrictId(entity.getWard().getWardPK().getMunicipality().getMunicipalityPK().getDistrict()
                    .getDistrictPK().getId());
            dto.setProvinceId(entity.getWard().getWardPK().getMunicipality().getMunicipalityPK().getDistrict()
                    .getDistrictPK().getProvince().getId());

            //  dto.setPersonId(entity.getPerson().getId());
            dto.setToleNep(entity.getToleNep());
            dto.setToleEng(entity.getToleEng());
            dto.setType(entity.getType());
            return dto;
        }

        public static UserAddress convert(UserAddressDto dto) {

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

            WardPK wardPK = new WardPK();
            wardPK.setId(dto.getWardId());
            wardPK.setMunicipality(municipality);

            Ward ward = new Ward();
            ward.setWardPK(wardPK);


            User person = new User();
            UserAddress entity = new UserAddress();
            entity.setId(dto.getId());
            entity.setWard(ward);
            entity.setToleNep(dto.getToleNep());
            entity.setToleEng(dto.getToleEng());
            entity.setType(dto.getType());

            return entity;
        }

        public static LoginDto convert(Login login){
            LoginDto dto = new LoginDto();
            dto.setId(login.getId());
            dto.setStatus(login.getStatus());
            dto.setUserRoles(login.getUserRole().getRoleName());
            dto.setUsername(login.getUsername());
            dto.setUserRole(login.getUserRole().getId());
            return dto;
        }
        public static UserRegisterDto convertSend(User user, List<UserAddress> address){
            UserRegisterDto dto = new UserRegisterDto();
            if (user!=null) {
                dto.setAddressDetails(address.stream().map(UserDtoConverter::convertAddress).collect(Collectors.toList()));
                dto.setUser(convert(user));
                dto.setUserRelative(user.getUserRelative().stream().map(UserDtoConverter::convert).collect(Collectors.toList()));
                try {
                    dto.setUserDocument(convert(user.getUserDocument().get(0)));
                } catch (IndexOutOfBoundsException ex) {
                    dto.setUserDocument(null);
                }
                dto.setLogin(convert(user.getLogin()));

                return dto;
            }

            return dto;
        }

        public static UserAddressDetail convertAddress(UserAddress entity) {

            ProvinceDto province = new ProvinceDto();
            province.setId(entity.getWard().getWardPK().getMunicipality().getMunicipalityPK().getDistrict().getDistrictPK()
                    .getProvince().getId());
            province.setName(entity.getWard().getWardPK().getMunicipality().getMunicipalityPK().getDistrict()
                    .getDistrictPK().getProvince().getName());

            DistrictDto district = new DistrictDto();
            district.setId(entity.getWard().getWardPK().getMunicipality().getMunicipalityPK().getDistrict().getDistrictPK()
                    .getId());
            district.setName(entity.getWard().getWardPK().getMunicipality().getMunicipalityPK().getDistrict().getName());

            MunicipalityDto municipality = new MunicipalityDto();
            municipality.setId(entity.getWard().getWardPK().getMunicipality().getMunicipalityPK().getId());
            municipality.setName(entity.getWard().getWardPK().getMunicipality().getName());

            WardDto ward = new WardDto();
            ward.setId(entity.getWard().getWardPK().getId());
            ward.setName(entity.getWard().getName());

            UserAddressDetail dto = new UserAddressDetail();
            dto.setId(entity.getId());
            dto.setProvince(province);
            dto.setDistrict(district);
            dto.setMunicipality(municipality);
            dto.setWard(ward);
            dto.setToleNep(entity.getToleNep());
            dto.setToleEng(entity.getToleEng());
            dto.setType(entity.getType());
            return dto;
        }




}
