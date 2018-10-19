package com.nguyenDat;


import javax.swing.*;
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
        textInput.setBounds(15,20,255,40);
        textInput.setFont(new Font(Font.DIALOG,Font.ITALIC,20));
        textInput.setBackground(new Color(0xFFEFC1));
        textInput.addKeyListener(this);
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
        if(InputApp.getTextInput().getText().equals("")){
            OutputApp.getOutputApp().setText("<html>   <head>        </head>   <body>   </body> </html> ");
            OutputApp.getOutputApp();
        }
        ListWord.UpdateList();
    }
}

