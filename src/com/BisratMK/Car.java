package com.BisratMK;

public class Car extends Vehicle {

    private String S = "The red Porsche is starting";

    public void SetStart() {
        System.out.println(S);
    }

    public void acceleration(String pass) {


        System .out.println( pass + " is accelerating");
    }

    public void SetStop() {
        System.out.println("The red Porsche is stopped");

    }
}