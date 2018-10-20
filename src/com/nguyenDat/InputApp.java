package com.nguyenDat;


import com.nguyenDat.DataDictionary.DataDictionarySQL;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.*;


public class InputApp implements KeyListener {
    private static JTextField textInput;
    private JLabel jLabel;

    public static JTextField getTextInput() {
        return textInput;
    }

    public InputApp() {
        textInput = new JTextField();
        textInput.setBounds(25, 95, 255, 35);
        textInput.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
        jLabel = new JLabel("Nhập từ cần tìm kiếm");
        jLabel.setFont(new Font(Font.DIALOG, Font.ITALIC, 13));
        jLabel.setBounds(10, 0, 200, 30);
        textInput.add(jLabel);
        textInput.addKeyListener(this);
        textInput.setBorder(BorderFactory.createLineBorder(new Color(0x07658F), 3));
        PanelBasic.getPaneBasic().add(textInput);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 10) {
            String mean = DataDictionarySQL.SearchAnhViet(InputApp.getTextInput().getText());
            if (mean == null) {
                JOptionPane.showConfirmDialog(Dictionary.getFrame(), "Từ này không có trong từ điển của bạn", "Thông Báo", JOptionPane.DEFAULT_OPTION);
            } else {
                OutputApp.getOutputApp().setText(mean);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (InputApp.getTextInput().getText().equals("")) {
            OutputApp.getOutputApp().setText("<html><head></head><body></body></html>");
            OutputApp.getOutputApp();
            jLabel.setVisible(true);
        } else {
            jLabel.setVisible(false);
        }
        ListWord.UpdateList();
    }
}

