package player;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
        try {
        	
        	java.net.URL path = Main.class.getResource("Night.wav");
        	File f = new File(path.getFile());        			
       
            AudioInputStream ais = AudioSystem.getAudioInputStream(f);
            
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.setFramePosition(0);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
            clip.stop();
            clip.close();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } catch (InterruptedException exc) {}
    }

}
