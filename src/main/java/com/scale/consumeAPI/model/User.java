package com.scale.consumeAPI.model;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

    @Entity
    @Table(name = "user")

    @XmlRootElement
    public class User {
    @Id
    private String id;
    @Column
    private String email;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String avatar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }   
}
