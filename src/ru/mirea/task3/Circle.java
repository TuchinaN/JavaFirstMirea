package ru.mirea.task3;

public class Circle {
    private int x, y, radius;
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public  Circle(int radius){
        this.radius = radius;
        x = 0;
        y = 0;
    }
    public  Circle(){
        x = 0;
        y = 0;
        radius = 1;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return  radius;
    }
    public void setCentre(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String toString(){
        return "Circle has radius "+radius+" and centre at ("+x+", "+y+")";
    }
}
