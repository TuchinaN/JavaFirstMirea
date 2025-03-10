package ru.mirea.task23;

public class TestHash {
    public static void main(String[] args) {
        Client cl1 = new Client("Kris", 123, 6);
        Client cl2 = new Client("Lara", 674, 19);
        Client cl3 = new Client("Mary", 789, 3);

        System.out.println("Проверим "+cl1.name+" и "+cl3.name+" на равенство");
        System.out.println(cl1.equals(cl3));

        System.out.println("Сравним "+cl1.name+" и "+cl1.name);
        System.out.println(cl2.equals(cl2));

        System.out.println("Выведем хеши наших клиентов");
        System.out.println(cl1.hashCode());
        System.out.println(cl2.hashCode());
        System.out.println(cl3.hashCode());
    }
}
