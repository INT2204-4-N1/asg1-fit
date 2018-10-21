package com.nguyenDat.PaneHome;

import com.nguyenDat.DataDictionary.*;
import com.nguyenDat.Dictionary;
import com.nguyenDat.Sound.SoundApp;
import com.nguyenDat.loadImage;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class ButtomApp implements ActionListener, MouseInputListener {
    private JButton bAdd, bEdit, bDelete, bSound;
    private EditAddOption editAddOption;

    public ButtomApp() {
        editAddOption = new EditAddOption();
        bAdd = new JButton(loadImage.load("image/add.png", 40, 40));
        bAdd.setContentAreaFilled(false);
        bAdd.setBorder(BorderFactory.createEmptyBorder());
        bAdd.setBounds(380, 95, 40, 40);

        bEdit = new JButton(loadImage.load("image/edit.png", 40, 40));
        bEdit.setContentAreaFilled(false);
        bEdit.setBorder(BorderFactory.createEmptyBorder());
        bEdit.setBounds(330, 95, 40, 40);

        bDelete = new JButton(loadImage.load("image/delete.png", 45, 45));
        bDelete.setContentAreaFilled(false);
        bDelete.setBorder(BorderFactory.createEmptyBorder());
        bDelete.setBounds(430, 95, 40, 40);

        bAdd.addActionListener(this);
        bEdit.addActionListener(this);
        bDelete.addActionListener(this);
        bAdd.addMouseListener(this);
        bEdit.addMouseListener(this);
        bDelete.addMouseListener(this);

        bSound = new JButton(loadImage.load("image/sound.png", 35, 35));
        bSound.setContentAreaFilled(false);
        bSound.setBorder(BorderFactory.createEmptyBorder());
        bSound.setBounds(480, 97, 35, 35);

        bSound.addActionListener(this);
        bSound.addMouseListener(this);

        bAdd.setEnabled(false);
        bSound.setEnabled(false);
        bDelete.setEnabled(false);
        bEdit.setEnabled(false);


        PaneHome.getPaneHome().add(bSound);
        PaneHome.getPaneHome().add(bAdd);
        PaneHome.getPaneHome().add(bEdit);
        PaneHome.getPaneHome().add(bDelete);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bSound) {
            SoundApp.Sound(PaneHome.AnhViet);
        }
        if (e.getSource() == bDelete) {
            DeleteWorḍ(InputApp.getTextInput().getText());
        }
        if (e.getSource() == bEdit) {
            String mean = DataDictionarySQL.SearchAnhViet(InputApp.getTextInput().getText());
            if (mean == null || InputApp.getTextInput().getText().equals("")) {
                if (InputApp.getTextInput().getText().equals(""))
                    JOptionPane.showConfirmDialog(Dictionary.getFrame(), "Nhập từ cần sửa vào ô tìm kiếm", "Thông báo", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showConfirmDialog(Dictionary.getFrame(), "Từ cần sửa không có trong từ điển của bạn", "Thông báo", JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            } else {
                editAddOption.EditWord(InputApp.getTextInput().getText());
            }
        }
        if (e.getSource() == bAdd) {
            editAddOption.AddWord();
        }
    }

    public void DeleteWorḍ(String word) {
        String mean = DataDictionarySQL.SearchAnhViet(word);
        if (mean == null) {
            JOptionPane.showConfirmDialog(Dictionary.getFrame(), "Từ muốn xóa không có trong từ điển của bạn", "Thông báo", JOptionPane.DEFAULT_OPTION);
        } else {
            int a = JOptionPane.showConfirmDialog(Dictionary.getFrame(), "Bạn có chắc muốn xóa từ này ?", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (a == JOptionPane.YES_OPTION) {
                DataDictionarySQL.DeleteWord(word);
                JOptionPane.showConfirmDialog(Dictionary.getFrame(), "Xóa thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);
                OutputApp.getOutputApp().setText("<html><head></head><body></body></html>");
                ListWord.UpdateList();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == bSound) {
            bSound.setEnabled(true);
        }
        if (e.getSource() == bAdd) {
            bAdd.setEnabled(true);
        }
        if (e.getSource() == bDelete) {
            bDelete.setEnabled(true);
        }
        if (e.getSource() == bEdit) {
            bEdit.setEnabled(true);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == bSound) {
            bSound.setEnabled(false);
        }
        if (e.getSource() == bAdd) {
            bAdd.setEnabled(false);
        }
        if (e.getSource() == bDelete) {
            bDelete.setEnabled(false);
        }
        if (e.getSource() == bEdit) {
            bEdit.setEnabled(false);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
