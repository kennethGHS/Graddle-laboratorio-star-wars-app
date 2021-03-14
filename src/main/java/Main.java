import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.Guia.GUI.Interface;
import org.Guia.GUI.Person;

import javax.swing.*;
import java.util.ArrayList;

import java.io.IOException;
import java.util.Arrays;

import static org.Guia.Request.Request.getCharsInfo;
import static org.Guia.Request.Request.getPersons;

public class Main {

    public static void main(String args[]) throws IOException {
        Interface  interfaz = new Interface();
        interfaz.executeFrame(getPersons());



    }


}
