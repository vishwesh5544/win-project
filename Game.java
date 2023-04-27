public class Game {
    private Level level;
    private Player player;
    private List<Enemy> enemies;
    private List<PowerUp> powerUps;
    private boolean isRunning;

    public Game(String playerName) {
        level = new Level();
        player = new Player();
        enemies = new ArrayList<>();
        powerUps = new ArrayList<>();
        isRunning = true;
    }

    public void update() {
        // Update player
        player.update();

        // Update enemies
        for (Enemy enemy : enemies) {
            enemy.update();
        }

        // Update power-ups
        for (PowerUp powerUp : powerUps) {
            powerUp.update();
        }

        // Check for collisions between player and enemies
        for (Enemy enemy : enemies) {
            if (player.intersects(enemy)) {
                player.decreaseHealth();
                if (player.getHealth() == 0) {
                    isRunning = false;
                }
            }
        }

        // Check for collisions between player and power-ups
        for (PowerUp powerUp : powerUps) {
            if (player.intersects(powerUp)) {
                powerUp.apply(player);
                powerUps.remove(powerUp);
                break;
            }
        }

        // Check if player has reached the end of the level
        if (player.getX() >= level.getEndX()) {
            isRunning = false;
        }
    }

    public void render(Graphics g) {
        // Render level
        level.render(g);

        // Render player
        player.render(g);

        // Render enemies
        for (Enemy enemy : enemies) {
            enemy.render(g);
        }

        // Render power-ups
        for (PowerUp powerUp : powerUps) {
            powerUp.render(g);
        }

        // Render player health
        g.drawString("Health: " + player.getHealth(), 10, 20);
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void start() {
    }
}
