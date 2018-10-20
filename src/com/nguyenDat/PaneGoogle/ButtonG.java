package com.nguyenDat.PaneGoogle;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

import com.nguyenDat.loadImage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class ButtonG implements ActionListener, MouseInputListener {
    private JButton bsearch;

    public ButtonG() {
        bsearch = new JButton(loadImage.load("image/search.png", 40, 40));
        bsearch.setText("Search");
        bsearch.setContentAreaFilled(false);
        bsearch.setBorder(BorderFactory.createEmptyBorder());
        bsearch.setBounds(20, 255, 110, 42);

        bsearch.addActionListener(this);
        PaneGoogleTranslate.getPaneGoogleTranslate().add(bsearch);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mean = searchGoogle.SearchGoogleTranslate(InputG.getInput().getText(), "en", "vi");
        OutputG.getOutput().setText(mean);
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

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
