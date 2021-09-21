package ru.mirea.task3;

public class Head {
    private String eyeColor;
    private String hairColor;

    public Head(String eyeColor, String hairColor){
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }
    public String getEyeColor(){
        return eyeColor;
    }
    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }
    public String getHairColor(){
        return hairColor;
    }
    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }
    public String toString(){
        return "Цвет глаз - "+eyeColor+", цвет волос - "+hairColor;
    }
}
