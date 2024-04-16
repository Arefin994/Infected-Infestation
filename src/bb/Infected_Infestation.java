package bb;

import main.GamePanel;

import java.awt.*;

public class Infected_Infestation {
    public static void main(String[] args) {
        Frame frame = new Frame("Infected Infestation");
        frame.setResizable(false);
        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

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
