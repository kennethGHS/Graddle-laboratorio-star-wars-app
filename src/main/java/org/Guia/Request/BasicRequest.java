package org.Guia.Request;

import java.io.IOException;
import java.util.ArrayList;

public interface BasicRequest {

    public  ArrayList<Person> getPersons() throws IOException;
}
