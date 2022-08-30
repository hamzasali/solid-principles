package com.cydeo.solid.dependencyInversion.example.good;

public class JSONReader implements Reader {


    @Override
    public String getUserName() {
        return "{\"username\": \"mikeSmith\"}";
    }
}
