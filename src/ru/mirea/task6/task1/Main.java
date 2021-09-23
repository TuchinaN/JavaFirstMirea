package ru.mirea.task6.task1;

public class Main {
    public static void main(String[] args) {
        Cats cat = new Cats("Рыжик", "рыжий");
        Dogs dog = new Dogs("Черныш", "чёрный");
        System.out.println(cat.getName());
        System.out.println(dog.getName());
    }
}