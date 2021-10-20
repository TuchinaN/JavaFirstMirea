package ru.mirea.task8.t1;
import java.awt.*;
public class Rectangle extends Shape
{
    protected int width;
    protected int height;
    public Rectangle(int x, int y, int width, int height, Color color)
    {
        this.width = width;
        this.height = height;
        this.color = color;
        this.pos = new Point(x,y);
    }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
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
