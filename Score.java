public class Score {
    private int score;

    public Score() {
        this.score = 0;
    }

    public void increaseScore(int amount) {
        score += amount;
    }

    public void resetScore() {
        score = 0;
    }

    public int getScore() {
        return score;
    }
}
