package ru.mirea.task6.task2;

public class Main {
    public static void main(String[] args) {
        Toys toy = new Toys("doll", 1.6);
        Food food = new Food("candies", 2.5);
        System.out.println(toy.getPrice());
        System.out.println(food.getPrice());
    }
}
