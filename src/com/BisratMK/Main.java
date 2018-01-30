package com.BisratMK;

public class Main {

    public static void main(String[] args) {
	//main method
        String R = "The red Porsche";

        Car carObject = new Car();
        carObject.SetStart();
        carObject.acceleration(R);
        carObject.SetSpeed();
        carObject.SetStop();

    }
}
