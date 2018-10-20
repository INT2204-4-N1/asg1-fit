package com.nguyenDat.Sound;

import GoogleAPI.Language;

import java.io.InputStream;

public class SoundApp {
    private static String word;

    public static void setWord(String word) {
        SoundApp.word = word;
    }

    public static void Sound(){
        try{
            GoogleAPI.Audio audio = GoogleAPI.Audio.getInstance();
            InputStream sound = audio.getAudio(word, Language.ENGLISH);
            audio.play(sound);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
