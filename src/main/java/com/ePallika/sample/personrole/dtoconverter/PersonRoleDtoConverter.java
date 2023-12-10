package com.ePallika.sample.personrole.dtoconverter;

import com.ePallika.sample.personrole.model.PersonRole;
import com.ePallika.sample.personrole.model.PersonRoleDto;

public class PersonRoleDtoConverter {

        public static PersonRoleDto convert(PersonRole personRole){
        PersonRoleDto dto = new PersonRoleDto();
        dto.setId(personRole.getId());
        dto.setName(personRole.getRoleName());
        return dto;
    }
}
