package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Task9 extends JFrame
{
    JPanel[] panel = new JPanel[3];
    JButton milanButton = new JButton("Milan");
    JButton madridButton = new JButton("Madrid");
    JLabel lastScoreLabel = new JLabel("Result: 0 X 0");
    JLabel resLabel = new JLabel("Last Scorer: N/A");
    JLabel winLabel = new JLabel("Winner: DRAW");
    int mil = 0, mad = 0;
    public Task9() {
        setSize(400,200);
        setLayout(new GridLayout(1,3));
        for (int i = 0; i < panel.length; i++) {
            panel[i] = new JPanel();
            add(panel[i]);
        }
        panel[0].setLayout(new BorderLayout());
        panel[0].add(milanButton, BorderLayout.CENTER);

        panel[1].setLayout(new FlowLayout());
        panel[1].add(lastScoreLabel);
        panel[1].add(resLabel);
        panel[1].add(winLabel);

        panel[2].setLayout(new BorderLayout());
        panel[2].add(madridButton, BorderLayout.CENTER);

        milanButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mil++;
                lastScoreLabel.setText("Result: "+mil+" X "+mad);
                resLabel.setText("Last Scorer: Milan");
                if(mil > mad)
                {
                    winLabel.setText("Winner: Milan");
                }
                if(mad > mil)
                {
                    winLabel.setText("Winner: Madrid");
                }
                if(mad == mil)
                {
                    winLabel.setText("Winner: DRAW");
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        madridButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mad++;
                lastScoreLabel.setText("Result: "+mil+" X "+mad);
                resLabel.setText("Last Scorer: Madrid");
                if(mad > mil)
                {
                    winLabel.setText("Winner: Madrid");
                }
                if(mil > mad)
                {
                    winLabel.setText("Winner: Milan");
                }
                if(mad == mil)
                {
                    winLabel.setText("Winner: DRAW");
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }

    public static void main(String[] args)
    {
        new Task9().setVisible(true);
    }
}