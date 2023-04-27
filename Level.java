import java.util.ArrayList;
import java.util.Random;

public class Level {
    private int levelNumber;
    private int numEnemies;
    private int numPowerUps;

    public Level(int levelNumber) {
        this.levelNumber = levelNumber;
        numEnemies = levelNumber * 10;
        numPowerUps = levelNumber * 5;
    }

    public ArrayList<Enemy> generateEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numEnemies; i++) {
            Enemy enemy = new Enemy(random.nextInt(100) + 1);
            enemies.add(enemy);
        }

        return enemies;
    }

    public ArrayList<PowerUp> generatePowerUps() {
        ArrayList<PowerUp> powerUps = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numPowerUps; i++) {
            PowerUp powerUp = new PowerUp(random.nextInt(3) + 1);
            powerUps.add(powerUp);
        }

        return powerUps;
    }

    public void displayInfo() {
        System.out.println("Level: " + levelNumber);
        System.out.println("Number of enemies: " + numEnemies);
        System.out.println("Number of power-ups: " + numPowerUps);
    }
}
