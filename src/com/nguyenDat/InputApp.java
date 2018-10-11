package com.nguyenDat;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputApp implements KeyListener {
    private static JTextField textInput;
    public static JTextField getTextInput(){
        return  textInput;
    }
    public InputApp(){
        textInput = new JTextField();
        textInput.setBounds(10,50,230,35);
        Dictionary.getFrame().add(textInput);
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
