package com.github.jayjaylab.wrongexample;

import javax.inject.Singleton;

/**
 * Created by jjkim on 2016. 5. 29..
 */
@Singleton
public class Weather {
    String state;

    public void setState(String state) {
        this.state = state;
    }

    public void printWeather() {
        System.out.println("current weather is " + state);
    }
}
