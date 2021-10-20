package ru.mirea.task8.t2;
import javax.swing.*;
import java.awt.*;
public class Main extends JFrame
{
    public static void main(String[] args)
    {
        Main m = new Main();
        m.paint();
    }
    public void paint()
    {
        JFrame frame = new JFrame();
        DrawPanel panel = new DrawPanel();
        frame.getContentPane().add(panel);
        frame.setSize(736, 920);
        frame.setVisible(true);
    }
}

