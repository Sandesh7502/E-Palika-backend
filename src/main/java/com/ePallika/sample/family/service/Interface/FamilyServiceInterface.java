package com.ePallika.sample.family.service.Interface;

import com.ePallika.sample.family.model.Family;
import com.ePallika.sample.family.model.dto.FamilyDto;
import org.springframework.data.domain.Page;

public interface FamilyServiceInterface {

    Page<Family> getAllFamily(int offset, int page);

    Family save(FamilyDto dto);
}
