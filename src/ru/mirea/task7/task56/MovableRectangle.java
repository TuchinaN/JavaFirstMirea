package ru.mirea.task7.task56;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    private boolean sameSpeedOfPoints(){
        return ((topLeft.xSpeed==bottomRight.xSpeed)&&(topLeft.ySpeed== bottomRight.ySpeed));
    }
    public String toString(){
        return "Rectangle with topLeft ("+topLeft.x+", "+topLeft.y+") and bottomRight ("+bottomRight.x+", "+bottomRight.y+")";
    }
    public void moveUp(){
        if(sameSpeedOfPoints()){
            topLeft.y += topLeft.ySpeed;
            bottomRight.y += bottomRight.ySpeed;
        }
        else return;
    }
    public void moveDown(){
        if(sameSpeedOfPoints()){
            topLeft.y -= topLeft.ySpeed;
            bottomRight.y -= bottomRight.ySpeed;
        }
        else return;
    }
    public void moveLeft(){
        if(sameSpeedOfPoints()){
            topLeft.x -= topLeft.xSpeed;
            bottomRight.x -= bottomRight.xSpeed;
        }
        else return;
    }
    public void moveRight(){
        if(sameSpeedOfPoints()){
            topLeft.x += topLeft.xSpeed;
            bottomRight.x += bottomRight.xSpeed;
        }
        else return;
    }
}