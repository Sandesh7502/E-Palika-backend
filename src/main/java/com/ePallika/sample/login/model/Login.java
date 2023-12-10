package com.ePallika.sample.login.model;





import com.ePallika.sample.personrole.model.PersonRole;
import com.ePallika.sample.user.model.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Login {

    @Id
    @GeneratedValue()
    private int Id;

    @Column(unique = true)
    private String username;

    private String password;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private PersonRole userRole;


    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private User user;

}
