package com.nguyenDat;

import com.nguyenDat.Sound.SoundApp;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.Locale;

import static javax.swing.JScrollPane.*;
import static javax.swing.SwingConstants.LEADING;

public class OutputApp implements  ActionListener {
    private static JEditorPane outPut;
    private JScrollPane jScrollPane;
    private static JButton bSound;
    public static JEditorPane getOutputApp(){
        if(!InputApp.getTextInput().getText().equals("")) {
            bSound.setEnabled(true);
            System.out.println(true);
        }
        else {
            bSound.setEnabled(false);
            System.out.println(false);
        }
        return outPut;
    }
    public OutputApp() {
        outPut = new JEditorPane();
        outPut.setContentType("text/html");
        outPut.setFocusable(false);
        bSound = new JButton(loadImage.load("image/sound.png",30,30));
        bSound.setContentAreaFilled(false);
        bSound.setBorder(BorderFactory.createEmptyBorder());
        bSound.setBounds(440,5,32,32);
        bSound.setEnabled(false);
        bSound.addActionListener(this);
        outPut.add(bSound);
        outPut.setBounds(355,65,500,550);
        jScrollPane = new JScrollPane(outPut);
        jScrollPane.setBounds(360,65,500,550);
        Dictionary.getFrame().add(jScrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SoundApp.Sound(InputApp.getTextInput().getText());
    }
}
