package com.ePallika.sample.user.service;

import com.ePallika.sample.user.model.dto.UserDocumentDto;
import com.ePallika.sample.user.model.entity.UserDocument;

public interface UserDocumentServiceInterface {

    UserDocument saveUserDocument(UserDocumentDto dto);
}
