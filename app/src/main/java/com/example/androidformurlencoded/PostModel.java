package com.example.androidformurlencoded;
public class PostModel {

    private String username;
    private String email;
    private String password1;
    private String password2;

    public PostModel(String username, String email, String password1, String password2){
        this.username = username;
        this.email = email;
        this.password1 = password1;
        this.password2 = password2;
    }

}