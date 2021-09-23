package ru.mirea.task5.task1;

public class Main {
    public static void main(String[] args) {
        Dish d1 = new Teapot("AAA", 5.7);
        System.out.println(d1.toString());

        Dish d2 = new Pan("BBB", 3.8);
        System.out.println(d2.toString());
    }
}
