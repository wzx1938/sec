package com.company.sec.dao.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private  String username;
    private  String password;
    private int pri;

    public User() {
    }

    public User(int id, String username, String password, int pri) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.pri = pri;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPri() {
        return pri;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", pri=" + pri +
                '}';
    }
}


