package ru.mirea.task5.task2;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Spitz("Addy", 2);
        System.out.println(dog1.toString());

        Dog dog2 = new Terrier("Bob", 3);
        System.out.println(dog2.toString());
    }
}
