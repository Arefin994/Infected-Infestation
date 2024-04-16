package bb;

import java.awt.*;
import java.awt.event.*;

import main.GamePanel;

public class Infected_Infestation {
    public static void main(String[] args) {
        Frame frame = new Frame("Infected Infestation");
        frame.setResizable(false);
        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Game loop
        while (true) {
            gamePanel.update();
            try {
                Thread.sleep(10); // Adjust frame rate as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
