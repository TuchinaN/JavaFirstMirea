package ru.mirea.task13;
import ru.mirea.task6.task1.Cats;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class ArrayListCats
{
    public static void main(String[] args)
    {
        ArrayList<Cats> cats = fillArrayList();
        Scanner in = new Scanner(System.in);
        int numberOfAction;
        do
        {
            System.out.println("Выберите действие: ");
            System.out.println("1. Вывести список");
            System.out.println("2. Добавить элемент в список");
            System.out.println("3. Удалить элемент по индексу");
            System.out.println("4. Найти размер списка");
            System.out.println("5. Найти элемент по индексу");
            System.out.println("6. Очистить список");
            System.out.println("0. Выход");
            numberOfAction = in.nextInt();
            switch (numberOfAction)
            {
                case 1:
                {
                    System.out.println("ArrayList:");
                    for (Cats i : cats)
                    {
                        System.out.println(i.toString());
                    }
                    break;
                }
                case 2:
                {
                    Cats newCat = new Cats();
                    System.out.println("Введите имя: ");
                    String name = in.next();
                    System.out.println("Введите цвет: ");
                    String color = in.next();
                    newCat.setName(name);
                    newCat.setColor(color);
                    cats.add(newCat);
                    break;
                }
                case 3:
                {
                    int index = in.nextInt();
                    if (index >= 0 && index < cats.size())
                    {
                        cats.remove(index);
                    }
                    break;
                }
                case 4:
                {
                    System.out.println(cats.size());
                    break;
                }
                case 5:
                {
                    int index = in.nextInt();
                    if (index >= 0 && index < cats.size())
                    {
                        System.out.println(cats.get(index).toString());
                    }
                    break;
                }
                case 6:
                {
                    cats.clear();
                    break;
                }
                case 0:
                {
                    numberOfAction = 0;
                    break;
                }
                default:
                {
                    System.out.println("Действия с таким вариантом нет!");
                }
            }

        } while (numberOfAction != 0);
        in.close();
    }
    public static ArrayList<Cats> fillArrayList() {
        Random random = new Random();
        ArrayList<Cats> cats = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Количество котов = ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = "Cat_" + i;
            String color = "Color_"+i;
            Cats cat = new Cats(name, color);
            cats.add(cat);
        }
        return cats;
    }
}
