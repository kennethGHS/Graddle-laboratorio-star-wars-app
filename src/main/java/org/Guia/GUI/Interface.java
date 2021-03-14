package org.Guia.GUI;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Interface {

    public void executeFrame(ArrayList<Person> characters){
        String data[][]=  new String[characters.size()][3];

        int i = 0;
        while (i!= characters.size()){
            data[i] = new String[]{characters.get(i).name, characters.get(i).height,characters.get(i).birthDate};
            i += 1;
        }
        System.out.println("-----------------");
        System.out.println(Arrays.deepToString(data));
        System.out.println("-----------------");
        JFrame f;
        f=new JFrame();
        String column[]={"Nombre","Altura","Nacimiento"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }



}
