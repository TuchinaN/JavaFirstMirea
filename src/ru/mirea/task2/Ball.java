package ru.mirea.task2;

public class Ball {
    private String color;
    private String sport;
    public Ball(String c, String s){
        color = c;
        sport = s;
    }
    public Ball(String c){
        color = c;
        sport = "anyone";
    }
    public Ball(){
        color = "multicolored";
        sport = "anyone";
    }
    public void setColor(String color){
        this.color = color;
    }
    public  void setSport(String sport){
        this.sport = sport;
    }
    public String getSport(){
        return sport;
    }
    public String toString(){
        return this.color+", sport "+this.sport;
    }
    public void outInf(){
        System.out.println(color+ ", "+ sport);
    }
}
