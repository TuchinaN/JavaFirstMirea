package ru.mirea.task12;
import java.util.Scanner;
public class TestSortingStudentsByGPA
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число студентов: ");
        int numb = in.nextInt();
        Student[] idNumbers = new Student[numb];
        for(int i = 0; i < numb; i++)
        {
            Student std = new Student((int)(Math.random() * 100 + i), (int)(Math.random() * 3 + 2));
            idNumbers[i] = std;
        }
        System.out.println("Список студентов:");
        for(int i = 0; i < numb; i++)
        {
            System.out.println(idNumbers[i].toString());
        }
        SortingStudentsByGPA.quickSort(idNumbers, 0, numb - 1);
        System.out.println("Отсортированный по id список студентов:");
        for(int i = 0; i < numb; i++)
        {
            System.out.println(idNumbers[i].toString());
        }
    }
}
