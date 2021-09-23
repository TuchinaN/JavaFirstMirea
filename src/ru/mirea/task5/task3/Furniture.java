package ru.mirea.task5.task3;

public abstract class Furniture {
    protected String type;
    public Furniture(String type){
        this.type = type;
    }
    protected Furniture() {
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
