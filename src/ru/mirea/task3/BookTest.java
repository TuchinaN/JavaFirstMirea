package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args){
        Book b1 = new Book("Poems","Pushkin", 1800);
        Book b2 = new Book("Poems","Lermontov", 1900);
        Book b3 = new Book("Poems");
        b2.setName("Yesenin");
        System.out.println(b1);
        b1.outInf();
        b2.outInf();
        b3.outInf();
    }
}
