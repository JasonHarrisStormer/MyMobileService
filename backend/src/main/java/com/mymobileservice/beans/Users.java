package com.mymobileservice.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class Users {
    @Id //laying out the table columns as private variables
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="enable")
    private Boolean enable;

    public Users() { }

    public Users(String email, String password, Boolean enable) {
        this.email = email;
        this.password = password;
        this.enable = enable;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

}
