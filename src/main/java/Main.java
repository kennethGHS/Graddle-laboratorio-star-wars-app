import org.Guia.GUI.Interface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import static org.Guia.Request.Request.getPersons;

public class Main {

    public static void main(String args[]) throws IOException {
	System.out.println("Creating interface");
        Interface interfaz = new Interface();
        interfaz.executeFrame(getPersons());
    }

}
