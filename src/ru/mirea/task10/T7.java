package ru.mirea.task10;
import java.util.Scanner;
public class T7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите исходное натуральное число больше 1: ");
        int n = sc.nextInt();
        if(n>1){
            System.out.println("Простые множители числа "+n+": ");
            fact(n,2);
        }
        else System.out.println("Больше 1!!!!!");
    }
    public static void fact(int n,int k) {
        if (k > n) return;
        if (n % k == 0) {
            System.out.println(k);
            while (n % k == 0) {
                n = n / k;
            }
        }
        fact(n, k + 1);
    }
}
