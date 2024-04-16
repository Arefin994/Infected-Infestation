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
        this.speed = 5; // Adjust bullet speed as needed
    }

    public void update() {
        double dx = Math.cos(Math.toRadians(angle)) * speed;
        double dy = Math.sin(Math.toRadians(angle)) * speed;
        x += dx;
        y += dy;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 5, 5); // Adjust bullet size as needed
    }
}
