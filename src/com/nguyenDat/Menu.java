package com.nguyenDat;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Menu implements MouseInputListener {
    private JPanel jPanelMenu;
    private JButton jButton3gach;
    public Menu(){
        jPanelMenu = new JPanel();
        jPanelMenu.setBounds(-170,0,200,680);
        jPanelMenu.setBackground(new Color(0x07658F));
        jPanelMenu.setLayout(null);
        jPanelMenu.setBorder(BorderFactory.createRaisedBevelBorder());


        jButton3gach = new JButton(loadImage.load("image/3gach.png",25,25));
        jButton3gach.setBounds(172,2,25,25);
        jButton3gach.setContentAreaFilled(false);
        jButton3gach.setBorder(BorderFactory.createEmptyBorder());

        jPanelMenu.add(jButton3gach);
        jPanelMenu.addMouseListener(this);
        jButton3gach.addMouseListener(this);

        Dictionary.getFrame().add(jPanelMenu);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == jPanelMenu || e.getSource() == jButton3gach){
            if(jPanelMenu.getX()< 0) {
                jPanelMenu.setLocation(0, 0);
                PanelBasic.getPaneBasic().setLocation(jPanelMenu.getWidth(), 0);
                jButton3gach.setLocation(-1000,2);
            }else{
                jPanelMenu.setLocation(-170,0);
                PanelBasic.getPaneBasic().setLocation(jPanelMenu.getWidth()+jPanelMenu.getX(),0);
                jButton3gach.setLocation(172,2);
            }
        }
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
