package ru.mirea.task5.task1;

public class Pan extends Dish{
    protected String brand;
    protected double price;
    public Pan(String brand, double price){
        this.type = "pan";
        this.brand = brand;
        this.price = price;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setPrice(double price){
        this.price = price;
    }
    @Override
    public String getBrand(){
        return brand;
    }
    @Override
    public double getPrice(){
        return price;
    }
    public String toString(){
        return "Type is "+type+", brand is "+brand+" for "+price;
    }
}
