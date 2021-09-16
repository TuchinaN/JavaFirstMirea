package ru.mirea.task1;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int numb = (int) (Math.random()*10)+1;
        Random random = new Random();
        int numb1 = random.nextInt(100);
        System.out.print("Число чисел в первом массиве: "+numb+"\n");
        int[] mass = new int[numb];
        int[] mass1 = new int[numb1];
        System.out.print("Массив: ");
        for (int i = 0; i < numb; i++) {
            mass[i] = (int) (Math.random()*10);
            System.out.print(mass[i]+"; ");
        }
        System.out.print("\n");
        Arrays.sort(mass);
        System.out.print("Отсортированный массив: ");
        for(int i = 0; i < numb; i++){
            System.out.print(mass[i]+"; ");
        }
        System.out.println("\n");
        System.out.print("Число чисел во втором массиве: "+numb1+"\n");
        System.out.print("Массив: ");
        for (int i = 0; i < numb1; i++) {
            mass1[i] = (int) random.nextInt(100);
            System.out.print(mass1[i]+"; ");
        }
        System.out.print("\n");
        Arrays.sort(mass1);
        System.out.print("Отсортированный массив: ");
        for(int i = 0; i < numb1; i++){
            System.out.print(mass1[i]+"; ");
        }
    }
}
