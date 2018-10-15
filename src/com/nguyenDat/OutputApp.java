package com.nguyenDat;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.io.IOException;
import java.util.Locale;

import static javax.swing.JScrollPane.*;
import static javax.swing.SwingConstants.LEADING;

public class OutputApp implements ChangeListener {
    private static JTextPane outPut;
    private JScrollPane jScrollPane;
    public static JTextPane getOutputApp(){
        return outPut;
    }
    public OutputApp() {
        outPut = new JTextPane();
        outPut.setContentType("text/html");
        outPut.setFocusable(false);
        outPut.setBounds(320,50,450,485);
        jScrollPane = new JScrollPane(outPut);

        jScrollPane.setBounds(320,50,450,485);
        Dictionary.getFrame().add(jScrollPane);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
    }
}
