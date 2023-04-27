import java.awt.*;

public class HUD {
    private Player player;
    private Score score;

    public HUD(Player player, Score score) {
        this.player = player;
        this.score = score;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawString("Health: " + player.getHealth(), 20, 20);
        g.drawString("Score: " + score.getScore(), 20, 40);
    }
}
