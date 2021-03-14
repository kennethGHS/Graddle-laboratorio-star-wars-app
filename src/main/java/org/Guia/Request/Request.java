package org.Guia.Request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;

public class Request {

    private static final Logger logger = LoggerFactory.getLogger(Request.class);

    static public String getCharsInfo() {
        ObjectMapper map = new ObjectMapper();
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("https://swapi.dev/api/people/");
        try {
            HttpResponse response = client.execute(request);
            String toReturn = IOUtils.toString(response.getEntity().getContent(), "UTF-8");

            JsonNode actualObj = null;
            actualObj = map.readTree(toReturn);
            return actualObj.get("results").toString();
        } catch (JsonProcessingException e) {
            logger.error("Unable to map Http response to json");
            logger.error(e.toString());
        } catch (IOException e) {
            logger.error("Unable to execute request to API");
            logger.error(e.toString());
        }
        return "{}";

    }

    static public ArrayList<Person> getPersons() {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode arrayNode = null;
        try {
            arrayNode = mapper.readTree(getCharsInfo());
        } catch (JsonProcessingException e) {
            logger.error("Unable to map Http response to json");
            e.printStackTrace();
            return null;
        }
        ArrayList<Person> characters = new ArrayList<>();
        for (JsonNode node : arrayNode) {
            String name = node.get("name").asText();
            String height = node.get("height").asText();
            String year = node.get("birth_year").asText();
            Person person = new Person(name, height, year);
            characters.add(person);
        }
        return characters;
    }

}
