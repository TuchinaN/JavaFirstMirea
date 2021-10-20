package ru.mirea.task13;
import ru.mirea.task6.task1.Cats;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
public class LinkedListCats
{
    public static void main(String[] args)
    {
        Random random = new Random();
        LinkedList<Cats> lkList = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Количество котов = ");
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = "Cat_" + i;
            String color = "Color_"+i;
            Cats cat = new Cats(name, color);
            lkList.add(cat);
        }
        System.out.println("Вывод списка");
        printCats(lkList);
        System.out.println("Добавление элементов");
        Cats cat1 = new Cats("Черныш", "чёрный");
        lkList.add(cat1);
        Cats cat2 = new Cats("Рыжик","рыжий");
        lkList.add(0, cat2);
        printCats(lkList);
        System.out.println("Размер списка");
        System.out.println("Size = " + lkList.size());
        System.out.println("Поиск элемент по индексу (2)");
        System.out.println(lkList.get(2).toString());
        printCats(lkList);
        System.out.println("Удаление элемента по индексу (0)");
        lkList.remove(0);
        printCats(lkList);
        System.out.println("Проверка на вхождение элементов (Рыжик и Черныш)");
        System.out.println(lkList.contains(cat1));
        System.out.println(lkList.contains(cat2));
        System.out.println("Очищение списка");
        lkList.clear();
        printCats(lkList);
    }
    public static void printCats(LinkedList<Cats> cats)
    {
        System.out.println("LinkedList:");
        for (Cats i : cats) {
            System.out.println(i.toString());
        }
    }
}
