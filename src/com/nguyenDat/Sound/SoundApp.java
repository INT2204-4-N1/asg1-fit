package com.nguyenDat.Sound;

import GoogleAPI.Language;
import com.nguyenDat.DataDictionary.DataDictionarySQL;
import com.nguyenDat.Dictionary;

import javax.swing.*;
import java.io.InputStream;

public class SoundApp {
    private static String word;
    private static GoogleAPI.Audio audio = GoogleAPI.Audio.getInstance();
    private static InputStream sound;

    public static void setWord(String word) {
        SoundApp.word = word;
    }

    public static void Sound() {
        try {
            sound = audio.getAudio(word, Language.ENGLISH);
            audio.play(sound);
        } catch (Exception e) {
        }
    }
}
