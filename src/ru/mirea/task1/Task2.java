package ru.mirea.task1;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество аргументов: ");
        int n = sc.nextInt();
        int[] mass = new int[n];
        System.out.println("Введите аргументы: ");
        for (int i = 0; i < n; i++){
            if(sc.hasNext()) mass[i] = sc.nextInt();
        }
        System.out.print("Вывод: ");
        for(int i = 0; i < n; i++){
            System.out.print(mass[i]);
        }
    }
}
