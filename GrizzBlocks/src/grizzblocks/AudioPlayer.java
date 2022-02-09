/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grizzblocks;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Andy Lim
 */
public class AudioPlayer {
    private String soundsFolder = "tetrissounds" + File.separator;
    private String clearLinePath = soundsFolder + "line.wav";
    private String gameoverPath = soundsFolder + "gameover.wav";
    private String blockfallPath = soundsFolder + "fall.wav";
    private String themePath = soundsFolder + "theme.wav";
    FloatControl volume;
    
    private Clip clearLineSound, gameoverSound, blockfallSound, themeSound;
    
    public AudioPlayer() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        clearLineSound = AudioSystem.getClip();
        gameoverSound = AudioSystem.getClip();
        blockfallSound = AudioSystem.getClip();
        themeSound = AudioSystem.getClip();
        
        clearLineSound.open(AudioSystem.getAudioInputStream( new File (clearLinePath).getAbsoluteFile()));
        gameoverSound.open(AudioSystem.getAudioInputStream( new File (gameoverPath).getAbsoluteFile()));
        blockfallSound.open(AudioSystem.getAudioInputStream( new File (blockfallPath).getAbsoluteFile()));
        themeSound.open(AudioSystem.getAudioInputStream( new File (themePath).getAbsoluteFile()));
    }
    
    public void playClearLine(){
        clearLineSound.setFramePosition(0);
        clearLineSound.start();
    }
    public void playGameover(){
        gameoverSound.setFramePosition(0);
        gameoverSound.start();
    }
     public void playBlockfall(){
        blockfallSound.setFramePosition(0);
        blockfallSound.start();
    }
     public void playTheme(){
        volume = (FloatControl) themeSound.getControl(FloatControl.Type.MASTER_GAIN);
        volume.setValue(-10.0f);
        themeSound.loop(Clip.LOOP_CONTINUOUSLY);
        themeSound.start();
    }
     public void stopTheme(){
         themeSound.stop();
     }

}

