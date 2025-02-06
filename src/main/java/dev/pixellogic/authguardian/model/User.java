package dev.pixellogic.authguardian.model;


import lombok.Builder;
import lombok.Getter;

import java.beans.ConstructorProperties;

@Builder
@Getter
public class User {


    private String userName;


    private String password;


    private String email;

    @ConstructorProperties({"userName","password","email"})
    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
}
