package com.example.tung.lesson3_login_facebook_mvvm.data;

/**
 * Created by tung on 5/23/17.
 */

public class Friend {
    private String name;
    private String image;

    public Friend(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
