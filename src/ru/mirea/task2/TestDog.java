package ru.mirea.task2;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Количество собак: ");
        int countOfDogs = sc.nextInt();
        Dog[] dogs = new Dog[countOfDogs];
        for(int i = 0; i<countOfDogs;i++){
            System.out.print("Имя собаки: ");
            String newName = sc.next();
            System.out.print("Возраст собаки: ");
            int newAge = sc.nextInt();
            dogs[i] = new Dog(newName,newAge);
        }
//проверка работы
        for(int i = 0; i<countOfDogs;i++){
            System.out.println(dogs[i].toString());
        }
    }
}
