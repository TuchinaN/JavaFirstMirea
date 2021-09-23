package ru.mirea.task5.task1;

public abstract class Dish {
    protected String type;
    public Dish(String type){
        this.type = type;
    }
    protected Dish() {
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public abstract String getBrand();
    public abstract double getPrice();
    public String toString(){
        return "Type is "+type;
    }
}
