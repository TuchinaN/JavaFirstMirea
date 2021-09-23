package ru.mirea.task7.task56;

public class Main {
    public static void main(String[] args){
        Movable point = new MovablePoint(7, 9, 2, 2);
        System.out.println(point);
        point.moveDown();
        point.moveLeft();
        System.out.println(point);

        Movable circle = new MovableCircle(3, 1, 5, 5, 8); // upcast
        System.out.println(circle);
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);

        Movable rect = new MovableRectangle(0,5, 7, 0, 4,4);
        System.out.println(rect);
        rect.moveUp();
        rect.moveRight();
        System.out.println(rect);
    }
}
