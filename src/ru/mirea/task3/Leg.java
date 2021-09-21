package ru.mirea.task3;

public class Leg {
    private float legLength;
    private float footSize;

    public Leg(float legLength, float footSize){
        this.legLength = legLength;
        this.footSize = footSize;
    }
    public float getLegLength(){
        return legLength;
    }
    public void setLegLength(float legLength){
        this.legLength = legLength;
    }
    public float getFootSize(){
        return footSize;
    }
    public void setFootSize(float footSize){
        this.footSize = footSize;
    }
    public String toString(){
        return "Длина ноги - "+legLength+", размер стопы - "+footSize;
    }
}
