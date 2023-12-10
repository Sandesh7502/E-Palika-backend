package com.ePallika.sample.urls.repository;

import com.ePallika.sample.urls.model.entity.Urls;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrlRepository extends JpaRepository<Urls,Long> {

    Page<Urls> findByOrderByIdDesc(Pageable pageable);

    List<Urls> findByOrderByIdDesc();
}
