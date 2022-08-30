package com.cydeo.solid.interfaceSegregation.example.good;

public class Owl implements CanFly{
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
