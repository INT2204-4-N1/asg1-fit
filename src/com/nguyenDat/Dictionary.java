package com.nguyenDat;

import com.nguyenDat.DataDictionary.DataDictionarySQL;

import javax.swing.*;
import java.awt.*;

public class Dictionary {
    private JPanel jPanel = new JPanel();
    private static JFrame mainFrame;
    private InputApp inputApp;

    public static JFrame getFrame(){
        return mainFrame;
    }
    public Dictionary(){
        mainFrame = new JFrame();
        mainFrame.setTitle("Dictionary");
        mainFrame.setBounds(150,100,800,600);
        new InputApp();
        new ListWord();
        new OutputApp();
        new ButtomApp();
        new DataDictionarySQL();
        jPanel.setBackground(new Color(0xA25407));
        jPanel.setSize(mainFrame.getSize());

        mainFrame.add(jPanel);
        mainFrame.setLayout(null);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.setVisible(true);

   }
}
