package com.alfianzv.hadiah1.models;

public class Drink {
    private String drinkName;
    private int thumbnail;

    public Drink(String drinkName, int thumbnail) {
        this.drinkName = drinkName;
        this.thumbnail = thumbnail;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
