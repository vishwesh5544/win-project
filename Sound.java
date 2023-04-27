import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sound {
    public static synchronized void playSoundEffect(String path) {
        new Thread(() -> {
            try {
                Clip clip = AudioSystem.getClip();
                AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path));
                clip.open(inputStream);
                clip.start();
                Thread.sleep(clip.getMicrosecondLength() / 1000);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }).start();
    }

    public static synchronized void playMusic(String path) {
        new Thread(() -> {
            try {
                Clip clip = AudioSystem.getClip();
                AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path));
                clip.open(inputStream);
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }).start();
    }
}
