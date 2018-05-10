package com.tablante.controller.Model;

public class User {

    private  String username;
    private  String password;
    private  String email;
    private String fname;
    private String lname;
    public User() {
    }

    public User(String username, String password, String email,String fname,String lname) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
    }

    public String getUsername() {
        return username.toLowerCase();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password.toLowerCase();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email.toLowerCase();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
