package com.nguyenDat;

import com.nguyenDat.DataDictionary.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtomApp implements ActionListener {
    private JButton bSearch,bAdd,bEdit,bDelete;
    public ButtomApp(){
        bSearch = new JButton(loadImage.load("image/search.png",80,70));
        bSearch.setContentAreaFilled(false);
        bSearch.setBorder(BorderFactory.createEmptyBorder());
        bSearch.setBounds(275,18,82,45);

        bAdd = new JButton(loadImage.load("image/add.png",80,70));
        bAdd.setContentAreaFilled(false);
        bAdd.setBorder(BorderFactory.createEmptyBorder());
        bAdd.setBounds(275,60,82,45);

        bEdit = new JButton(loadImage.load("image/edit.png",80,70));
        bEdit.setContentAreaFilled(false);
        bEdit.setBorder(BorderFactory.createEmptyBorder());
        bEdit.setBounds(275,102,82,45);

        bDelete = new JButton(loadImage.load("image/delete.png",80,70));
        bDelete.setContentAreaFilled(false);
        bDelete.setBorder(BorderFactory.createEmptyBorder());
        bDelete.setBounds(275,144,82,45);



        bSearch.addActionListener(this);
        bAdd.addActionListener(this);
        bEdit.addActionListener(this);
        bDelete.addActionListener(this);

        Dictionary.getFrame().add(bAdd);
        Dictionary.getFrame().add(bSearch);
        Dictionary.getFrame().add(bEdit);
        Dictionary.getFrame().add(bDelete);
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
