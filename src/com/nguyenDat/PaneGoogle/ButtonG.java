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
        if(!InputG.getInput().getText().equals(""))
            OutputG.getOutput().setText(Search());
    }

    public String Search(){
        String w = InputG.getInput().getText();
        String Mean = "";
        int start = 0;
        for(int i = 0; i < w.length();i++){
            if(w.charAt(i) == 10 || w.charAt(i) == '.' || i == w.length() - 1){
                Mean+= searchGoogle.SearchGoogleTranslate(w.substring(start,i+1),"en","vi");
                if(w.charAt(i) == 10) Mean+="\n";
                start = i+1;
            }
        }
        return Mean;
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
