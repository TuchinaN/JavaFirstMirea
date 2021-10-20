package ru.mirea.task8.t3;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
public class Main extends JFrame
{
    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;
    static Image image;
    protected static ArrayList<Image> frames = new ArrayList<>();
    public Main()
    {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics graphic)
    {
        super.paintComponents(graphic);
        graphic.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args)
    {
        new Main();
        frames.add(new ImageIcon("C:\\Users\\tuchi\\OneDrive\\Рабочий стол\\Images\\1.png").getImage());
        frames.add(new ImageIcon("C:\\Users\\tuchi\\OneDrive\\Рабочий стол\\Images\\2.png").getImage());
        frames.add(new ImageIcon("C:\\Users\\tuchi\\OneDrive\\Рабочий стол\\Images\\3.png").getImage());
        frames.add(new ImageIcon("C:\\Users\\tuchi\\OneDrive\\Рабочий стол\\Images\\4.png").getImage());
        frames.add(new ImageIcon("C:\\Users\\tuchi\\OneDrive\\Рабочий стол\\Images\\5.png").getImage());

        Main frame = new Main();

        while (true)
        {
            for (int i = 0; i < 5; i++)
            {
                image = frames.get(i);
                frame.repaint();
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}

