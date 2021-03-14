import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.Kenneth.GUI.Person;

import javax.swing.*;
import java.util.ArrayList;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.Kenneth.Request.Resquest.getCharsInfo;

public class Main {

    public static void main(String args[]) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode arrayNode = mapper.readTree(getCharsInfo());
        ArrayList<Person> characters = new ArrayList<Person>();
        for (JsonNode node: arrayNode){
            String name = node.get("name").asText();
            String height = node.get("height").asText();
            String year = node.get("birth_year").asText();


            Person person =  new Person(name,height,year);
            characters.add(person);


        }
        ArrayList<String> personArray = new ArrayList<String>();
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
