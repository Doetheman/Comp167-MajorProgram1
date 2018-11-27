/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorblasterbackend;

import java.net.URL;
import javafx.scene.media.AudioClip;

/**
 *
 * @author Doetheman
 */
public class SoundData {

    private AudioClip[] sounds;
    public int ENGINE_CLIP_NUM;
    public int EXPLOSION_CLIP_NUM;
    public int BEEP_CLIP_NUM;
    public int TRANSPORTER_CLIP_NUM;
    public int SHIELDS_CRITICAL_CLIP_NUM;

    public SoundData() {
        sounds = new AudioClip[5];
        ENGINE_CLIP_NUM = 0;
        EXPLOSION_CLIP_NUM = 1;
        BEEP_CLIP_NUM = 2;
        TRANSPORTER_CLIP_NUM = 3;
        SHIELDS_CRITICAL_CLIP_NUM = 4;
    }

    public void setSoundResource(int index, String soundFile) {
        URL soundResource = getClass().getResource(soundFile);
        sounds[index] = new AudioClip(soundResource.toString());
    }

    public int getNumSounds() {
        return sounds.length;
    }

    public AudioClip getSound(int index) {
        return sounds[index];
    }

    @Override
    public String toString() {
        String s = System.lineSeparator();
        String all = "";

        for (int i = 0; i < sounds.length; i++) {
            all += sounds[i] + s;
       }
        return all;

    }
}
