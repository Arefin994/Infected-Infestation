package main;

import java.awt.*;

public class Bullet {
    private int x;
    private int y;
    private int speed;
    private int angle;

    public Bullet(int x, int y, int angle) {
        this.x = x;
        this.y = y;
        this.angle = angle;
        this.speed = 10; // Adjust bullet speed as needed
    }

    public void update() {
        double dx = Math.cos(Math.toRadians(angle)) * speed;
        double dy = Math.sin(Math.toRadians(angle)) * speed;
        x += dx;
        y += dy;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.BLUE);
        g2d.rotate(Math.toRadians(angle), x, y);
        g2d.fillRect(x - 2, y - 2, 5, 5); // Adjust bullet size as needed
        g2d.dispose();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
