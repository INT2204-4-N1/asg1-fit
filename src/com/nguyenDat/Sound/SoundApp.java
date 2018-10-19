package com.nguyenDat.Sound;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SoundApp {
    private static final String VOICE = "kevin16";
    public static void Sound(String Word){
        try{
            System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
            Voice voice;
            VoiceManager vm = VoiceManager.getInstance();
            voice = vm.getVoice(VOICE);
            voice.allocate();
            voice.speak(Word);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
