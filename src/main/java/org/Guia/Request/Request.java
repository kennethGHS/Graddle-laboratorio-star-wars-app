package org.Guia.Request;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.Guia.GUI.Person;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.ArrayList;


public class Request {

    static public String getCharsInfo() throws IOException {
        ObjectMapper map = new ObjectMapper();
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("https://swapi.dev/api/people/");
        HttpResponse response = client.execute(request);
        String toReturn = IOUtils.toString(response.getEntity().getContent(),"UTF-8");
        JsonNode actualObj = map.readTree(toReturn);

        return actualObj.get("results").toString();
    }

    static public ArrayList<Person> mapToPerson(String persons) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = mapper.readTree(persons);
        ArrayList<Person> personArrayList = new ArrayList<>();
        int len = actualObj.size();
        int i = 0;
        while (i<len){

        }
        return personArrayList;
    }


}
