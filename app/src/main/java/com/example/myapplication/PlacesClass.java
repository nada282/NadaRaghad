package com.example.myapplication;

public class PlacesClass {
    private String name;
    private String image;


    public PlacesClass(){

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

    public PlacesClass(String name, String image) {
        this.name = name;
        this.image = image;
    }




}
