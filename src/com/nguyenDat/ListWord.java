package com.nguyenDat;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListWord implements ListSelectionListener {
    private static JList list  = new JList();
    private static JScrollPane Scroll = new JScrollPane() ;

    public static JList getList(){
        return list;
    }
    public ListWord(){
        list.setBounds(10,85,230,450);
        Scroll.add(list);
        Scroll.setBounds(10,85,230,450);

        Dictionary.getFrame().add(Scroll);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}
