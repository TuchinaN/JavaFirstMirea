package ru.mirea.task8.t2;
import javax.swing.*;
import java.awt.*;
public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("C:\\Users\\tuchi\\OneDrive\\Рабочий стол\\image.jpeg").getImage();
        g.drawImage(image, 3, 4, this);
    }

}
