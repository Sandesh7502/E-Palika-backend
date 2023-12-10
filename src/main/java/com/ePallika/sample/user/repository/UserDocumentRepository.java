package com.ePallika.sample.user.repository;


import com.ePallika.sample.user.model.entity.UserDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDocumentRepository extends JpaRepository<UserDocument,Long> {
}
