import java.awt.image.BufferedImage;

public class Animation {
    private BufferedImage[] frames;
    private int currentFrame;
    private long startTime;
    private long delay;

    public Animation() {
    }

    public void setFrames(BufferedImage[] frames) {
        this.frames = frames;
        currentFrame = 0;
        startTime = System.nanoTime();
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }

    public void update() {
        long elapsed = (System.nanoTime() - startTime) / 1000000;
        if (elapsed > delay) {
            currentFrame++;
            startTime = System.nanoTime();
        }
        if (currentFrame == frames.length) {
            currentFrame = 0;
        }
    }

    public BufferedImage getCurrentFrame() {
        return frames[currentFrame];
    }
}
