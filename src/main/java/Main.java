import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.Kenneth.GUI.Person;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.Kenneth.Request.Resquest.getCharsInfo;

public class Main {

    public static void main(String args[]) throws IOException {
        String persons = getCharsInfo();
        ObjectMapper mapper = new ObjectMapper();
        //Este mapea a una lista de personas, nada mas llame una tabla y las mete y le hace display
        List<Person> personList = Arrays.asList(mapper.readValue(persons,Person[].class));
        for (Person person1:personList
             ) {
            System.out.println(person1.name);

        }



    }


}
