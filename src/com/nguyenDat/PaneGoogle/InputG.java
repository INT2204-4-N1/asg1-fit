package com.nguyenDat.PaneGoogle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class InputG implements KeyListener {
    private static JTextArea Input;
    private JScrollPane Scroll;

    public static JTextArea getInput() {
        return Input;
    }

    public InputG() {
        Input = new JTextArea();
        Input.setBounds(30, 100, 800, 150);
        Input.setBorder(BorderFactory.createLineBorder(new Color(0x07658F), 3));
        Input.setFont(new Font(Font.DIALOG,Font.BOLD,16));
        Input.setLineWrap(true);
        Input.setWrapStyleWord(true);

        Scroll = new JScrollPane(Input);
        Scroll.setBounds(Input.getBounds());

        PaneGoogleTranslate.getPaneGoogleTranslate().add(Scroll);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
