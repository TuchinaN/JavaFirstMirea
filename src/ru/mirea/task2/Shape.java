package ru.mirea.task2;

public class Shape {
    private String shape;
    private String color;
    public Shape(String shape, String color){
        this.shape = shape;
        this.color = color;
    }
    public Shape(String shape){
        this.shape = shape;
        color = "white";
    }
    public Shape(){
        shape = "polygon";
        color = "white";
    }
    public String getShape(){
        return shape;
    }
    public void setShape(String shape){
        this.shape = shape;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }
    public String toString(){
        return "Shape is "+shape+" and it's color is "+color;
    }

}
