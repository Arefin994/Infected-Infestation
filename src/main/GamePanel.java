package main;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class GamePanel extends Panel implements MouseMotionListener {
    private Player player;
    private Bullet bullet;

    public GamePanel() {
        this.setPreferredSize(new Dimension(800, 600)); // Adjust panel size as needed
        this.setBackground(Color.WHITE);
        this.addMouseMotionListener(this);
        player = new Player(400, 300); // Initial player position
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        player.draw(g);
        if (bullet != null) {
            bullet.draw(g);
        }
    }

    public void update() {
        if (bullet != null) {
            bullet.update();
        }
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Not needed for now
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        player.update(e.getX(), e.getY());
    }
}
