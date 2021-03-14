package org.Guia.Request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Person{
    public String name;
    public String height;
    public String birthDate;

    public Person(){
        this.height = "";
        this.name = "";
        this.birthDate = "";
    }
    public Person(String name, String height, String birthDate){
        this.name = name;
        this.height = height;
        this.birthDate =  birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }
}