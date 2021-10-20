package ru.mirea.task6.task1;

public class Cats implements Nameable{
    private String name;
    private String color;
    public Cats(String name, String color){
        this.name = name;
        this.color = color;
    }
    public Cats()
    {
        name = "-";
        color = "-";
    }
    public String getName(){
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String toString(){
        return name+" is " +color;
    }
}
