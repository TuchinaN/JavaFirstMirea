package ru.mirea.task12;
import java.util.Scanner;
public class TestMerger
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число студентов для первого списка: ");
        int numb1 = in.nextInt();
        Student[] arr1 = new Student[numb1];
        for(int i = 0; i < numb1; i++)
        {
            Student std = new Student((int)(Math.random() * 100 + i), (int)(Math.random() * 5));
            arr1[i] = std;
        }
        System.out.print("Введите число студентов для второго списка: ");
        int numb2 = in.nextInt();
        Student[] arr2 = new Student[numb2];
        for(int i = 0; i < numb2; i++)
        {
            Student std = new Student((int)(Math.random() * 100 + i), (int)(Math.random() * 3 + 2));
            arr2[i] = std;
        }
        arr1 = insertionSort(arr1);
        arr2 = insertionSort(arr2);
        Student[] res =  mergeArr(arr1, arr2);
        System.out.println("Отсортированный список студентов:");
        for(int i = 0; i < (numb1+numb2); i++)
        {
            System.out.println(res[i].toString());
        }
    }
    public static Student[] insertionSort(Student []arr)
    {
        for (int left = 0; left < arr.length; left++)
        {
            Student student = arr[left];
            int i = left - 1;
            for (; i >= 0; i--)
            {
                if (student.getFinalGrade() < arr[i].getFinalGrade())
                {
                    arr[i + 1] = arr[i];
                }
                else break;
            }
            arr[i + 1] = student;
        }
        return arr;
    }
    public static Student[]  mergeArr(Student[] arr1, Student[] arr2) {
        Student[] arr = new Student[arr1.length + arr2.length];
        int pos1 = 0, pos2 = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (pos1 > arr1.length - 1)
            {
                Student temp = arr2[pos2];
                arr[i] = temp;
                pos2++;
            }
            else if (pos2 > arr2.length - 1)
            {
                Student temp = arr1[pos1];
                arr[i] = temp;
                pos1++;
            }
            else if (arr1[pos1].getFinalGrade() < arr2[pos2].getFinalGrade())
            {
                Student temp = arr1[pos1];
                arr[i] = temp;
                pos1++;
            }
            else
            {
                Student temp = arr2[pos2];
                arr[i] = temp;
                pos2++;
            }
        }
        return arr;
    }
}
