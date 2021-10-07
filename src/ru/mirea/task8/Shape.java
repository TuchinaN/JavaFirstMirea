package ru.mirea.task8;

public abstract class Shape {
    protected String color;
    protected boolean position;
    public Shape(){
        color = "blue";

    }
    public Shape(String color){
        this.color = color;

    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return "Shape is "+color;
    }
}