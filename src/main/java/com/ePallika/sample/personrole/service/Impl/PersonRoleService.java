package com.ePallika.sample.personrole.service.Impl;


import com.ePallika.sample.personrole.model.PersonRole;
import com.ePallika.sample.personrole.repository.PersonRoleRepository;
import com.ePallika.sample.personrole.service.Interface.PersonRoleInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonRoleService implements PersonRoleInterface {

    @Autowired
    PersonRoleRepository repo;

    public List<PersonRole> getPersonRole(){
        return repo.findAll();
    }
}
