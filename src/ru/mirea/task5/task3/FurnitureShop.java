package ru.mirea.task5.task3;

public class FurnitureShop {
    public static void main(String[] args) {
        Furniture f1 = new Bed("Milena", 17.8);
        System.out.println(f1.toString());

        Furniture f2 = new Sofa("Rotterdam", 24.8);
        System.out.println(f2.toString());

        Furniture f3 = new Lamp("Philips", 13.4);
        System.out.println(f3.toString());
    }
}
