package com.ePallika.sample.urls.service.Interface;

import com.ePallika.sample.urls.model.dto.UrlsDto;
import com.ePallika.sample.urls.model.entity.Urls;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UrlServiceInterface {

    Page<Urls> getAllUrl(int offset, int page);

    Urls save(UrlsDto dto);

    List<Urls> getAll();

    Urls getById(long id);
}
