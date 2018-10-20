package com.nguyenDat.PaneHome;

import com.nguyenDat.PaneHome.PaneHome;

import javax.swing.*;
import java.awt.*;

public class OutputApp {
    private static JEditorPane outPut;
    private JScrollPane jScrollPane;
    private static JButton bSound;

    public static JEditorPane getOutputApp() {
        return outPut;
    }

    public OutputApp() {
        outPut = new JEditorPane();
        outPut.setContentType("text/html");
        outPut.setFocusable(false);
        outPut.setBounds(330, 135, 500, 490);

        jScrollPane = new JScrollPane(outPut);
        jScrollPane.setBounds(330, 135, 500, 490);
        jScrollPane.setBorder(BorderFactory.createLineBorder(new Color(0x07658F), 3));


        PaneHome.getPaneHome().add(jScrollPane);
    }
}
