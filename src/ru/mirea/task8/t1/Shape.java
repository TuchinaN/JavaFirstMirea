package ru.mirea.task8.t1;
import java.awt.*;
public abstract class Shape
{
    protected Color color;
    protected Point pos;
    public Shape(Color color, Point pos)
    {
        this.color = color;
        this.pos = pos;
    }
    public Shape()
    {
        color = Color.BLACK;
    }
    public Point getPos()
    {
        return pos;
    }
    public void  setPos(Point pos)
    {
        this.pos = pos;
    }
    public abstract Color getColor();
}