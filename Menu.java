import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Menu {
    private String[] options;
    private int selectedIndex;

    public Menu(String[] options) {
        this.options = options;
        this.selectedIndex = 0;
    }

    public void selectUp() {
        if (selectedIndex > 0) {
            selectedIndex--;
        }
    }

    public void selectDown() {
        if (selectedIndex < options.length - 1) {
            selectedIndex++;
        }
    }

    public int getSelectedIndex() {
        return selectedIndex;
    }

    public void draw(Graphics g, int x, int y) {
        g.setFont(new Font("Arial", Font.BOLD, 30));
        for (int i = 0; i < options.length; i++) {
            if (i == selectedIndex) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.BLACK);
            }
            g.drawString(options[i], x, y + i * 50);
        }
    }

    public boolean isKeyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            selectUp();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            selectDown();
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            return true;
        }
        return false;
    }
}
