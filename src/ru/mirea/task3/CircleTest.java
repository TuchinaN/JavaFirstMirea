package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3, 0, 5);
        Circle c2 = new Circle(9);
        Circle c3 = new Circle();
        System.out.println(c1.getY());
        System.out.println(c3.getRadius());
        c2.setCentre(3, 5);
        c1.setRadius(2);
        System.out.println(c2.getX());
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
