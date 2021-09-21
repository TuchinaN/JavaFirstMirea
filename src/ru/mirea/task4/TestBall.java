package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(4.0, 7.2);
        System.out.println(ball);
        ball.move(2.3, 1.6);
        System.out.println(ball);
    }
}
