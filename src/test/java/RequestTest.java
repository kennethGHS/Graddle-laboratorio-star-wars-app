
import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.Guia.Request.Person;

public class RequestTest {
    public Person person;

    @BeforeEach
    public void setUp() throws Exception {
        person = new Person();
    }

    @Test
    public void testReturnValue() {

        assertEquals("Kenneth", person.setName("Kenneth"),
                "Setteamos nombre deberia funcionar");
    }
}
