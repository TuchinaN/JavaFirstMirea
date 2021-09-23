package ru.mirea.task6.task2;

public class  Food implements Priceable{
    private String name;
    private double price;
    public Food (String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return name+" for " +price;
    }
    public double getPrice(){
        return price;
    }
}
