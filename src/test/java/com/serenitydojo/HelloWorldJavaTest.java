package com.serenitydojo;

import org.junit.Test;

public class HelloWorldJavaTest {

    @Test
    public void shouldWriteHelloWorldToConsole(){
        HelloWorldWritter writter = new HelloWorldWritter();
        writter.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables(){

        int ageThisYear = 32;
        int ageNextYear = ageThisYear+1;
        System.out.println("Age = "+ageNextYear);

        double weight = 15.5;
        System.out.println("Weight = "+weight);

        long starsInGalaxy = 1000000000000L;
        System.out.println("Stars in galaxy = "+starsInGalaxy);
    }
}
