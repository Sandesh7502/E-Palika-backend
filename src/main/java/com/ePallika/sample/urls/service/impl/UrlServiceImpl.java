package com.ePallika.sample.urls.service.impl;

import com.ePallika.sample.address.repository.MunicipalityRepository;
import com.ePallika.sample.urls.dtoconverter.UrlDtoConverter;
import com.ePallika.sample.urls.model.dto.UrlsDto;
import com.ePallika.sample.urls.model.entity.Urls;
import com.ePallika.sample.urls.repository.UrlRepository;
import com.ePallika.sample.urls.service.Interface.UrlServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlServiceImpl implements UrlServiceInterface {

    @Autowired
    UrlRepository urlRepository;

    @Autowired
    MunicipalityRepository municipalityRepository;


    @Override
    public Urls save(UrlsDto dto){
        Urls url = UrlDtoConverter.convert(dto);
        url.setMunicipality(municipalityRepository.getByMunicipalityPk(url.getMunicipality().getMunicipalityPK()));
        return urlRepository.save(url);

    }

    @Override
    public Page<Urls> getAllUrl(int offset, int page){
        return urlRepository.findByOrderByIdDesc(PageRequest.of(offset, page));
    }

    @Override
    public List<Urls> getAll(){
        return urlRepository.findByOrderByIdDesc();
    }

    @Override
    public Urls getById(long id){
        return urlRepository.findById(id).orElse(null);
    }
}
