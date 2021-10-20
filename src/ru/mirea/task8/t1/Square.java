package ru.mirea.task8.t1;
import java.awt.*;
public class Square extends Shape
{
    protected int side;
    public Square(int x, int y, int side, Color color)
    {
        this.side = side;
        this.color = color;
        this.pos = new Point(x,y);
    }
    public int getSide()
    {
        return side;
    }
    public double getX()
    {
        return pos.getX();
    }
    public double getY()
    {
        return pos.getY();
    }
    @Override
    public Color getColor()
    {
        return color;
    }
}
