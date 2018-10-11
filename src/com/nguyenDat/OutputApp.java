package com.nguyenDat;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Locale;

import static javax.swing.JScrollPane.*;
import static javax.swing.SwingConstants.LEADING;

public class OutputApp implements ChangeListener {
    private JSlider jSlider = new JSlider(14,35);
    private static JLabel output = new JLabel();
    private JTextArea jTextArea;
    private JScrollPane jScrollPane;
    public static JLabel getOutputApp(){
        return output;
    }
    public OutputApp(){
        jTextArea = new JTextArea();
        jTextArea.setBounds(320,50,450,485);
        jTextArea.setToolTipText("nguyen va dat");
        jTextArea.setDefaultLocale(Locale.getDefault());
        output.setBounds(0,0,450,485);
        JPanel jPanel = new JPanel();
        jPanel.setBounds(320,50,450,485);
        jPanel.setBackground(new Color(0xD5DEC4));
        jPanel.setLayout(null);
        output.setBorder(BorderFactory.createRaisedBevelBorder());
        output.setVerticalAlignment(1);
        jSlider.setBounds(320,20,450,20);
        jSlider.setBackground(new Color(0x79C5FC));
        output.setText("<html>Nguyen van davvt anh yeu dm <br> nfidhs dsdhsiad df sgdfjdsjs fgjs fgjs fjsfgjsfgsjfgjs <br>gfsjfgjsfgsjfgsjd fgjsfgsjfgfggs sgsjg shdjsg shgsj d dgsjgds d sjgdjdg sj d dgjd sdgjsdgs j gdsj dsg sj sds jsd sd jds sdjdgad daigdaa hadgha udguadg aud aud gaud aud gau dau da udaudgaudgd aud aud audgad au dau duadgu</html>");
        output.setFont(new Font("Courier New", Font.ITALIC, 40));
        output.setHorizontalTextPosition(LEADING);
        //output.setDisplayedMnemonic(90);

        jScrollPane = new JScrollPane(output);
        jScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS);
        jPanel.add(jScrollPane);
        jScrollPane.setBounds(0,0,450,485);
        jSlider.addChangeListener(this);
       // Dictionary.getFrame().add(jSlider);
       // Dictionary.getFrame().add(jPanel);
        Dictionary.getFrame().add(jTextArea);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        output.setFont(new Font("Courier New", Font.ITALIC, jSlider.getValue()));
    }
}
