package com.ePallika.sample.user.repository;

import com.ePallika.sample.user.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("FROM User u WHERE u.nameEng LIKE %:name%")
    List<User> findByNameEng(String name);


}
