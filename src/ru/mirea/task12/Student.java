package ru.mirea.task12;

public class Student
{
    private  int idNumb;
    private int finalGrade;

    public Student(int idNumb, int finalGrade)
    {
        this.idNumb = idNumb;
        this.finalGrade = finalGrade;
    }
    public int getIdNumb()
    {
        return idNumb;
    }
    public void setIdNumb(int idNumb)
    {
        this.idNumb = idNumb;
    }
    public int getFinalGrade()
    {
        return finalGrade;
    }
    public void setFinalGrade(int finalGrade)
    {
        this.finalGrade = finalGrade;
    }
    public boolean compareTo(Object obj)
    {
        if(this == obj) return true;
        if((obj == null)||(getClass() != obj.getClass())) return false;
        Student std = (Student) obj;
        return (idNumb == std.idNumb && finalGrade == std.finalGrade);
    }
    @Override
    public String toString()
    {
        return "Ученик | " + idNumb + " | " + finalGrade;
    }
}
