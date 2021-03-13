package org.Kenneth.GUI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Person{
    public String name;
    public String height;


    Person(){
        this.height = "";
        this.name = "";
    }
    Person(String name,String height){
        this.name = name;
        this.height = height;
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