package com.nguyenDat;

import com.nguyenDat.DataDictionary.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtomApp implements ActionListener {
    private JButton bSearch,bAdd,bEdit,bDelete,bSound;
    public ButtomApp(){
        bSearch = new JButton("search");
        bSearch.setBounds(250,50,60,35);

        bAdd = new JButton("add");
        bAdd.setBounds(250,95,60,35);

        bEdit = new JButton("Edit");
        bEdit.setBounds(250,140,60,35);
        bDelete = new JButton("delete");
        bDelete.setBounds(250,185,60,35);

        bSound = new JButton("sound");
        bSound.setBounds(250,230,60,35);

        bSearch.addActionListener(this);
        bAdd.addActionListener(this);
        bEdit.addActionListener(this);
        bDelete.addActionListener(this);
        bSound.addActionListener(this);

        Dictionary.getFrame().add(bAdd);
        Dictionary.getFrame().add(bSearch);
        Dictionary.getFrame().add(bEdit);
        Dictionary.getFrame().add(bDelete);
        Dictionary.getFrame().add(bSound);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bSearch){
            String mean;
            mean = DataDictionarySQL.SearchAnhViet(InputApp.getTextInput().getText());
            if(!InputApp.getTextInput().getText().equals("")) {
                if (!mean.equals("")) {
                    OutputApp.getOutputApp().setText(mean);
                } else {
                    JOptionPane.showConfirmDialog(Dictionary.getFrame(), "Từ không có trong từ điển", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                }
            }
        }else {
            if (e.getSource() == bAdd) {
            } else {
                if (e.getSource() == bEdit) {

                } else {
                    if (e.getSource() == bDelete) {

                    } else {

                    }
                }
            }
        }
    }
}
