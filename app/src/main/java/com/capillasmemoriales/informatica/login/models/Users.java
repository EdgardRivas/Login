package com.capillasmemoriales.informatica.login.models;

import android.net.Uri;

public class Users {

    private String id;
    private String name;
    private String email;
    private Uri photo;

    public Users () {

    }

    public Users(String id, String name, String email, Uri photo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.photo = photo;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Uri getPhoto() {
        return photo;
    }

    public void setPhoto(Uri photo) {
        this.photo = photo;
    }
}