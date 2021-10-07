package ru.mirea.task10;
import java.util.Scanner;
public class T10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, десятичная запись которого не содержит нулей: ");
        int n = sc.nextInt();
        System.out.print("Перевёрнутое число: ");
        rec(n);
    }
    public static int rec(int n) {
        if(n < 10) {
            System.out.print(n);
            return n;
        }
        else {
            System.out.print(n % 10);
            return rec(n/10);
        }
    }
}
