package ru.mirea.task1;

public class Task1 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        System.out.print("Массив: ");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
            System.out.print(mass[i]+" ");
        }
        for(int i = 0; i < mass.length; i++) {
            sum1+=mass[i];
        }
        int i = 0;
        while(i<mass.length){
            sum2+=mass[i];
            i++;
        }
        i = 0;
        do{
            sum3+=mass[i];
            i++;
        }while (i<mass.length);
        System.out.println("\nСумма элементов массива = "+sum1);
        System.out.println("Сумма элементов массива = "+sum2);
        System.out.println("Сумма элементов массива = "+sum3);
    }
}
