package ru.mirea.task3;

public class Hand {
    private float armLength;
    private float fingerSize;

    public Hand(float armLength, float fingerSize){
        this.armLength = armLength;
        this.fingerSize = fingerSize;
    }
    public float getArmLength(){
        return armLength;
    }
    public void setArmLength(float armLength){
        this.armLength = armLength;
    }
    public float getFingerSize(){
        return fingerSize;
    }
    public void setFingerSize(float fingerSize){
        this.fingerSize = fingerSize;
    }
    public String toString(){
        return "Размер руки - "+armLength+", обхват пальца - "+fingerSize;
    }
}
