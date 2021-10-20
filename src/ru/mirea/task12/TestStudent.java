package ru.mirea.task12;
import java.util.Scanner;
public class TestStudent
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
        idNumbers = insertionSort(idNumbers);
        System.out.println("Отсортированный по id список студентов:");
        for(int i = 0; i < numb; i++)
        {
            System.out.println(idNumbers[i].toString());
        }
    }
    public static Student[] insertionSort(Student[] arr)
    {
        for (int j = 0; j < arr.length; j++)
        {
            Student std = arr[j];
            int i = j-1;
            for(; i>=0; i--)
            {
                if(std.getIdNumb() < arr[i].getIdNumb())
                {
                    arr[i+1] = arr[i];
                }
                else break;
            }
            arr[i+1] = std;
        }
        return arr;
    }
}
