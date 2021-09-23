package ru.mirea.task6.task1;

public class Dogs implements Nameable{
    private String name;
    private String color;
    public Dogs(String name, String color){
        this.name = name;
        this.color = color;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name+" is " +color;
    }
}
