package com.example.administrator.mytest;

/**
 * Created by Administrator on 2017/5/7 0007.
 */

public class Fruit {
    private String name;
    private int image;

    public Fruit(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
