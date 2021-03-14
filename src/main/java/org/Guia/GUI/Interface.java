package org.Guia.GUI;

import org.Guia.Request.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Interface {

    private static final Logger logger = LoggerFactory.getLogger(Interface.class);

    public void executeFrame(ArrayList<Person> characters) {
        String[][] data = new String[characters.size()][3];

        logger.info("Parsing StarWars characters");
        int i = 0;
        while (i != characters.size()) {
            data[i] = new String[]{characters.get(i).name, characters.get(i).height, characters.get(i).birthDate};
            i += 1;
        }
        logger.info("StarWars characters found: " + Arrays.deepToString(data));

        logger.info("Setup GUI");
        JFrame f;
        f = new JFrame();
        String[] column = {"Nombre", "Altura", "Nacimiento"};
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
        logger.info("Launch GUI");

    }


}
