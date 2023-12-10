package com.ePallika.sample.personrole.repository;


import com.ePallika.sample.personrole.model.PersonRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRoleRepository extends JpaRepository<PersonRole,Long> {

}

