package ru.mirea.task3;

public class Book {
    private String name;
    private String author;
    private int age;
    public Book(String n, String a, int ag){
        name = n;
        author = a;
        age = ag;
    }
    public Book(String n){
        name = n;
        author = "Block";
        age = 2000;
    }
    public Book(){
        name = "Fairy tales";
        author = "";
        age = 1812;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getName(String name){
        return name;
    }
    public String getAuthor(String author){
        return author;
    }
    public String toString(){
        return this.name + ", author " + this.author+ "from " + this.age;
    }
    public void outInf(){
        System.out.println(name+" "+author+" "+(2021-age)+" years");
    }
}
