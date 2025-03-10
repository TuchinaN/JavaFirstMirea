package ru.mirea.task7.task14;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        color = "blue";
        filled = false;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        if(filled) return "Shape is "+color;
        else  return "Shape is not "+color;
    }
}