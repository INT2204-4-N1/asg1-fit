package com.nguyenDat.PaneHome;

import com.nguyenDat.Dictionary;
import com.nguyenDat.loadImage;

import javax.swing.*;

public class PaneHome {
    private static JPanel PaneH = new JPanel();
    private JLabel jLabel;

    public static JPanel getPaneHome() {
        return PaneH;
    }

    public PaneHome() {
        PaneH.setBounds(30, 0, 900, 680);
        PaneH.setLayout(null);
        jLabel = new JLabel(loadImage.load("image/dictionary1.png", 340, 80));
        jLabel.setBounds(480, 5, 350, 80);
        PaneH.add(jLabel);
        Dictionary.getFrame().add(PaneH);
    }
}
