package ru.mirea.task7.task56;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint centre;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        centre = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public String toString(){
        return "Circle at point ("+centre.x+", "+centre.y+") with radius "+radius;
    }
    public void moveUp(){
        centre.y+=centre.ySpeed;
    }
    public void moveDown(){
        centre.y-=centre.ySpeed;
    }
    public void moveLeft(){
        centre.x-=centre.xSpeed;
    }
    public void moveRight(){
        centre.x+=centre.xSpeed;
    }
}
