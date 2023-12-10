package com.ePallika.sample.login.model.Dto;


import com.ePallika.sample.login.model.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {

    private int id;

    private String username;
    private String password;

    private long userRole;

    private String userRoles;

    private Status status;

}
