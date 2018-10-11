package com.nguyenDat;

import javax.swing.*;
import java.util.zip.DeflaterInputStream;

public class ButtomApp {
    private JButton bSearch,bAdd,bEdit,bDelete,bSound;
    public ButtomApp(){
        bSearch = new JButton("search");
        bSearch.setBounds(280,50,50,35);

        bAdd = new JButton("add");
        bAdd.setBounds(280,100,50,35);

        Dictionary.getFrame().add(bAdd);
        Dictionary.getFrame().add(bSearch);
    }
}
