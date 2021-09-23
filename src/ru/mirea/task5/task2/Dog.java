package ru.mirea.task5.task2;

public abstract class Dog {
    protected String breed;
    public Dog(String breed){
        this.breed = breed;
    }
    protected Dog() {
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    public abstract String getName();
    public abstract double getAge();
    public String toString(){
        return "Breed is "+breed;
    }
}
