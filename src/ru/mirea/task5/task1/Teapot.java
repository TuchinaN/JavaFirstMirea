package ru.mirea.task5.task1;

public class Teapot extends Dish {
    protected String brand;
    protected double price;
    public Teapot(String brand, double price){
        this.type = "teapot";
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
