package ru.mirea.task3;

public class Human {
    public static void main(String[] args) {
        Head head = new Head("Blue", "blond");
        Hand hand1 = new Hand(69, (float) 8.34);
        Hand hand2 = new Hand(67, (float) 8.34);
        Leg leg1 = new Leg(77, 36);
        Leg leg2 = new Leg(77, 37);
        System.out.println("Параметры человека:");
        System.out.println(head.toString());
        System.out.println(hand1.toString());
        System.out.println(hand2.toString());
        System.out.println(leg1.toString());
        System.out.println(leg2.toString());
    }
}
