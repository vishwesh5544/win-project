import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Projectile {
    private int x, y, width, height, speed;
    private boolean visible;

    public Projectile(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        width = 5;
        height = 5;
        visible = true;
    }

    public void update() {
        x += speed;
        if (x > Game.WIDTH || x < 0) {
            visible = false;
        }
    }

    public void draw(Graphics2D g) {
        g.fillRect(x, y, width, height);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
