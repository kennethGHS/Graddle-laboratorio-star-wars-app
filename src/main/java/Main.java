import org.Guia.GUI.Interface;
import org.Guia.Request.BasicRequest;
import org.Guia.Request.Request;

import java.io.IOException;


public class Main {
    public static void Execute(BasicRequest basicRequest) throws IOException {

        Interface  interfaz = new Interface();
        interfaz.executeFrame(basicRequest.getPersons());
    }
    public static void main(String args[]) throws IOException {
        Execute(new Request());


    }


}
