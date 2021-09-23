package ru.mirea.task5.task2;

public class Spitz extends Dog {
    protected String name;
    protected int age;
    public Spitz(String name, int age){
        breed = "spitz";
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public double getAge(){
        return age;
    }
    public String toString() {
        return "Breed is " + breed + ", name is " + name + ", age is " + age;
    }
}
