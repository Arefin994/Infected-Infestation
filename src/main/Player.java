package main;
import java.awt.*;

public class Player {
    private int x;
    private int y;
    private int angle;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.angle = 0;
    }

    public void update(int mouseX, int mouseY) {
        double dx = mouseX - x;
        double dy = mouseY - y;
        angle = (int) Math.toDegrees(Math.atan2(dy, dx));
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.rotate(Math.toRadians(angle), x, y);
        g2d.setColor(Color.RED);
        g2d.fillRect(x - 10, y - 10, 20, 20); // Adjust size as needed
        g2d.dispose();
    }

    public void shoot() {
        // Implement bullet shooting logic here
    }
}