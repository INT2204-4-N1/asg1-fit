package com.nguyenDat;

import com.nguyenDat.PaneGoogle.PaneGoogleTranslate;
import com.nguyenDat.PaneHome.PaneHome;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Menu implements MouseInputListener {
    private JPanel jPanelMenu;
    private JButton jButton3gach, h;
    private JLabel DicImage, jLabelHome, jLableG;
    private JPanel Home, Google;

    public Menu() {
        jPanelMenu = new JPanel();
        jPanelMenu.setBounds(-170, 0, 200, 680);
        jPanelMenu.setBackground(new Color(0x07658F));
        jPanelMenu.setLayout(null);
        jPanelMenu.setBorder(BorderFactory.createRaisedBevelBorder());
        DicImage = new JLabel(loadImage.load("image/dictionary2.png", 200, 80));
        DicImage.setBounds(0, 20, 200, 80);
        DicImage.setVisible(false);

        Home = new JPanel();
        Google = new JPanel();

        Home.setBounds(0, 100, 200, 50);
        Home.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        Home.setBackground(new Color(0x075A8F));
        Google.setBounds(0, 151, 200, 50);
        Google.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        Google.setBackground(new Color(0x075A8F));
        jLabelHome = new JLabel(loadImage.load("image/home.png", 200, 40), SwingConstants.LEFT);
        jLabelHome.setBounds(0, 0, 200, 50);
        jLableG = new JLabel(loadImage.load("image/google.png", 200, 40), SwingConstants.LEFT);
        jLableG.setBounds(0, 0, 200, 50);

        Home.setLayout(null);
        Home.add(jLabelHome);
        Google.setLayout(null);
        Google.add(jLableG);
        Home.setVisible(false);
        Google.setVisible(false);

        jButton3gach = new JButton(loadImage.load("image/3gach.png", 25, 25));
        jButton3gach.setBounds(172, 2, 25, 25);
        jButton3gach.setContentAreaFilled(false);
        jButton3gach.setBorder(BorderFactory.createEmptyBorder());

        jPanelMenu.add(jButton3gach);
        jPanelMenu.add(DicImage);
        jPanelMenu.add(Home);
        jPanelMenu.add(Google);
        Home.addMouseListener(this);
        Google.addMouseListener(this);
        jPanelMenu.addMouseListener(this);
        jButton3gach.addMouseListener(this);

        Dictionary.getFrame().add(jPanelMenu);
    }

    public void ActionPane() {
        if (jPanelMenu.getX() < 0) {
            jPanelMenu.setLocation(0, 0);
            PaneHome.getPaneHome().setLocation(jPanelMenu.getWidth(), 0);
            PaneGoogleTranslate.getPaneGoogleTranslate().setLocation(jPanelMenu.getWidth(), 0);
            jButton3gach.setLocation(-1000, 2);
            DicImage.setVisible(true);
            Home.setVisible(true);
            Google.setVisible(true);
        } else {
            jPanelMenu.setLocation(-170, 0);
            PaneHome.getPaneHome().setLocation(jPanelMenu.getWidth() + jPanelMenu.getX(), 0);
            PaneGoogleTranslate.getPaneGoogleTranslate().setLocation(jPanelMenu.getWidth() + jPanelMenu.getX(), 0);
            jButton3gach.setLocation(172, 2);
            DicImage.setVisible(false);
            Home.setVisible(false);
            Google.setVisible(false);


        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == jPanelMenu || e.getSource() == jButton3gach) {
            ActionPane();
        }
        if (e.getSource() == Home) {
            PaneHome.getPaneHome().setVisible(true);
            PaneGoogleTranslate.getPaneGoogleTranslate().setVisible(false);
        }
        if (e.getSource() == Google) {
            PaneHome.getPaneHome().setVisible(false);
            PaneGoogleTranslate.getPaneGoogleTranslate().setVisible(true);
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
