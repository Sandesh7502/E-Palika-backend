package com.ePallika.sample.family.service.Impl;

import com.ePallika.sample.family.dtoconverter.FamilyDtoConverter;
import com.ePallika.sample.family.model.Family;
import com.ePallika.sample.family.model.dto.FamilyDto;
import com.ePallika.sample.family.repository.FamilyRepository;
import com.ePallika.sample.family.service.Interface.FamilyServiceInterface;
import com.ePallika.sample.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class FamilyImplService implements FamilyServiceInterface {

    @Autowired
    FamilyRepository repo;

    @Autowired
    UserRepository userRepository;

    @Override
    public Family save(FamilyDto dto){
        Family family= FamilyDtoConverter.convert(dto);
        family.setUser(userRepository.findById(dto.getUserId()).orElse(null));
        return repo.save(family);
    }

    @Override
    public Page<Family> getAllFamily(int offset, int page){
        return repo.findAll(PageRequest.of(offset, page));
    }

}
