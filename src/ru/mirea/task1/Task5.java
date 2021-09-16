package ru.mirea.task1;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(n+"! = "+ans);
    }
    public static int fact(int numb){
        int fact = 1;
        for(int i = 2; i<=numb; i++){
            fact *= i;
        }
        return  fact;
    }
}