package com.ePallika.sample.user.service.Impl;


import com.ePallika.sample.user.dtoconverter.UserDtoConverter;
import com.ePallika.sample.user.model.dto.UserDocumentDto;
import com.ePallika.sample.user.model.entity.UserDocument;
import com.ePallika.sample.user.repository.UserDocumentRepository;
import com.ePallika.sample.user.service.UserDocumentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDocumentService  implements UserDocumentServiceInterface {

    @Autowired
    UserDocumentRepository userDocumentRepository;

    @Override
    public UserDocument saveUserDocument(UserDocumentDto dto){
        return userDocumentRepository.save(UserDtoConverter.convert(dto));
    }
}
