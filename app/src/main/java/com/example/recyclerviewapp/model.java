package com.example.recyclerviewapp;

import android.media.Image;

public class model {

    String title;
    int image;

    public model() {
    }

    public model(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
