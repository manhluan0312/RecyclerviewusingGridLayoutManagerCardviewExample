package com.example.recyclerviewusinggridlayoutmanagercardviewexample.model;

public class User
{
    //khai bao cach hien thi danh sach
    public static final int TYPE_GRID=1;
    public static final int TYPE_LIST=2;
    public static final int TYPE_STAGGER=3;

    public int getTypeDisplay() {
        return TypeDisplay;
    }

    public void setTypeDisplay(int typeDisplay) {
        TypeDisplay = typeDisplay;
    }

    private int TypeDisplay;
    private int re_image;
    private String name;

    public User(int re_image, String name) {
        this.re_image = re_image;
        this.name = name;
    }

    public int getRe_image() {
        return re_image;
    }

    public void setRe_image(int re_image) {
        this.re_image = re_image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
