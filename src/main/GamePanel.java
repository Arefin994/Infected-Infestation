package main;

import java.awt.*;
import java.awt.event.*;

public class GamePanel extends Panel implements MouseMotionListener, MouseListener, KeyListener {
    private Player player;
    private Bullet bullet;

    public GamePanel() {
        this.setPreferredSize(new Dimension(800, 600)); // Adjust panel size as needed
        this.setBackground(Color.WHITE);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.addKeyListener(this);
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
            // Remove bullet if it goes off-screen
            if (bullet.getX() < 0 || bullet.getX() > getWidth() || bullet.getY() < 0 || bullet.getY() > getHeight()) {
                bullet = null;
            }
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

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            bullet = player.shoot();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        player.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        player.keyReleased(e);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
