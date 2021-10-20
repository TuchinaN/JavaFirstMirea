package ru.mirea.task12;
import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator<Student>
{
    public static void quickSort(Student[] array, int low, int high)
    {
        if (array.length == 0) return;
        if (low >= high) return;
        int middle = low + (high - low) / 2;
        double support = array[middle].getFinalGrade();
        int i = low, j = high;
        while (i <= j)
        {
            while (array[i].getFinalGrade() > support)
            {
                i++;
            }
            while (array[j].getFinalGrade() < support)
            {
                j--;
            }
            if (i <= j)
            {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) quickSort(array, low, j);
        if (high > i) quickSort(array, i, high);
    }
    public int compare(Student a, Student b)
    {
        if(a.getFinalGrade() > b.getFinalGrade()) return 1;
        else if(a.getFinalGrade() < b.getFinalGrade()) return -1;
        else return 0;
    }
}
