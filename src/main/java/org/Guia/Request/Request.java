package org.Guia.Request;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.ArrayList;


public class Request implements BasicRequest {

    static public String getCharsInfo() throws IOException {
        ObjectMapper map = new ObjectMapper();
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("https://swapi.dev/api/people/");
        HttpResponse response = client.execute(request);
        String toReturn = IOUtils.toString(response.getEntity().getContent(),"UTF-8");
        JsonNode actualObj = map.readTree(toReturn);

        return actualObj.get("results").toString();
    }

    public ArrayList<Person> getPersons() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode arrayNode = mapper.readTree(getCharsInfo());
        ArrayList<Person> characters = new ArrayList<>();
        for (JsonNode node: arrayNode){
            String name = node.get("name").asText();
            String height = node.get("height").asText();
            String year = node.get("birth_year").asText();
            Person person =  new Person(name,height,year);
            characters.add(person);
        }

        return characters;
    }


}
