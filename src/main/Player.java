package main;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Player {
    private int x;
    private int y;
    private int angle;
    private int speed;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.angle = 0;
        this.speed = 5; // Adjust speed as needed
    }

    public void update(int mouseX, int mouseY) {
        double dx = mouseX - x;
        double dy = mouseY - y;
        angle = (int) Math.toDegrees(Math.atan2(dy, dx));
    }

    public void move(int dx, int dy) {
        x += dx * speed;
        y += dy * speed;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.rotate(Math.toRadians(angle), x, y);
        g2d.setColor(Color.RED);
        g2d.fillRect(x - 10, y - 10, 20, 20); // Adjust size as needed
        g2d.dispose();
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_W) {
            move(0, -1);
        } else if (keyCode == KeyEvent.VK_S) {
            move(0, 1);
        } else if (keyCode == KeyEvent.VK_A) {
            move(-1, 0);
        } else if (keyCode == KeyEvent.VK_D) {
            move(1, 0);
        }
    }

    public void keyReleased(KeyEvent e) {
        // Handle key release events if needed
    }

    public Bullet shoot() {
        // Create a new bullet in the direction of the player's angle
        return new Bullet(x, y, angle);
    }
}
