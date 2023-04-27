public class Player {
    private String name;
    private int score;
    private int level;

    public Player(String name) {
        this.name = name;
        score = 0;
        level = 1;
    }

    public void updateScore(int points) {
        score += points;
    }

    public void updateLevel() {
        level++;
    }

    public void displayInfo() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        System.out.println("Level: " + level);
    }
}
