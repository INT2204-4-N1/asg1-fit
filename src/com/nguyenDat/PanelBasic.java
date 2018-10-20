package com.nguyenDat;

import javax.swing.*;

public class PanelBasic {
    private static JPanel jPanel = new JPanel();
    private JLabel jLabel ;
    public static JPanel getPaneBasic(){
        return jPanel;
    }

    public PanelBasic(){
        jPanel.setBounds(30,0,900,680);
        jPanel.setLayout(null);
        jLabel = new JLabel(loadImage.load("image/dictionary.png",350,90));
        jLabel.setBounds(555,0,300,90);
        jPanel.add(jLabel);
        Dictionary.getFrame().add(jPanel);
    }
}
