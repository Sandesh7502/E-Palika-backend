package com.ePallika.sample.login.repository;



import com.ePallika.sample.login.model.Login;
//import org.springframework.data.jpa.repository.JpaRepository;
import com.ePallika.sample.user.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityUserRepository extends JpaRepository<Login,Integer> {
    @Query("From Login u where u.username = :username")
    Login getUserByUsername(@Param("username") String userName);

    Login findByUser(User user);

}
