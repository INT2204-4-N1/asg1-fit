package com.nguyenDat;

import com.nguyenDat.DataDictionary.DataDictionarySQL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EditAddOption implements ActionListener, KeyListener {
    JDialog jDialog;
    JTextField jTextField;
    JEditorPane jEditorPane;
    JButton bCanel,bCapnhat,bThem;
    String oldWord;
    String mean;
    public void EditWord(String word){
        oldWord = word;

        jDialog = new JDialog(Dictionary.getFrame(),"Chỉnh sửa từ");
        jDialog.setBounds(Dictionary.getFrame().getX(),Dictionary.getFrame().getY(),500,550);

        jTextField = new JTextField(oldWord);
        jTextField.setBounds(10,10,250,30);
        jTextField.setBorder(BorderFactory.createLineBorder(new Color(0x07658F),3));
        bCapnhat = new JButton("Ok");
        bCanel = new JButton("Cannel");
        bCanel.setBounds(100,460,80,30);
        bCapnhat.setBounds(10,460,80,30);

        jEditorPane = new JEditorPane();
        jEditorPane.setContentType("text/html");
        jEditorPane.setText(DataDictionarySQL.SearchAnhViet(oldWord));
        jEditorPane.setBounds(10,50,470,400);
        jEditorPane.setBorder(BorderFactory.createLineBorder(new Color(0x07658F),3));

        bCanel.addActionListener(this);
        bCapnhat.addActionListener(this);

        jDialog.add(jEditorPane);
        jDialog.add(jTextField);
        jDialog.add(bCanel);
        jDialog.add(bCapnhat);
        jDialog.setLayout(null);
        jDialog.setVisible(true);
    }
    public void AddWord(){
        jDialog = new JDialog(Dictionary.getFrame(),"Thêm từ");
        jDialog.setBounds(Dictionary.getFrame().getX(),Dictionary.getFrame().getY(),500,550);
        mean = "";
        jTextField = new JTextField();
        jTextField.setBounds(10,10,250,30);
        jTextField.setBorder(BorderFactory.createLineBorder(new Color(0x07658F),3));
        bThem = new JButton("Thêm");
        bCanel = new JButton("Cannel");
        bCanel.setBounds(100,460,80,30);
        bThem.setBounds(10,460,80,30);

        jEditorPane = new JEditorPane();
        jEditorPane.setContentType("text/html");
        jEditorPane.setBounds(10,50,470,400);
        jEditorPane.setBorder(BorderFactory.createLineBorder(new Color(0x07658F),3));

        bCanel.addActionListener(this);
        bThem.addActionListener(this);
        jEditorPane.addKeyListener(this);

        jDialog.add(jEditorPane);
        jDialog.add(jTextField);
        jDialog.add(bCanel);
        jDialog.add(bThem);
        jDialog.setLayout(null);
        jDialog.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bCanel){
            jDialog.dispose();
        }
        if(e.getSource() == bCapnhat){
            DataDictionarySQL.UpdateWord(oldWord,jTextField.getText(),jEditorPane.getText());
            jDialog.dispose();
            ListWord.UpdateList();
            JOptionPane.showConfirmDialog(Dictionary.getFrame(),"Sủa thành công","Thông báo",JOptionPane.DEFAULT_OPTION);
        }
        if(e.getSource() == bThem){
            if(jTextField.getText().equals("") || mean.equals("")){
                JOptionPane.showConfirmDialog(Dictionary.getFrame(),"Không được để trống các ô nhập","Thông báo", JOptionPane.DEFAULT_OPTION);
            }else{
                String check = DataDictionarySQL.SearchAnhViet(jTextField.getText());
                if(check == null){
                    DataDictionarySQL.addWord(jTextField.getText(),jEditorPane.getText());
                    jDialog.dispose();
                    JOptionPane.showConfirmDialog(Dictionary.getFrame(),"Thêm thành công","Thông báo",JOptionPane.DEFAULT_OPTION);
                }else{
                    int a = JOptionPane.showConfirmDialog(Dictionary.getFrame(),"Từ đã có trong từ điển \n Bạn chỉ có thể chỉnh sửa","Thông báo",JOptionPane.OK_CANCEL_OPTION);

                    if(a == JOptionPane.YES_OPTION){
                        EditWord(jTextField.getText());
                    }
                }
            }

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyChar() == 8){
            if(mean!=null) mean+=e.getKeyChar();
        }else mean+=e.getKeyChar();
    }
}
