package com.github.jayjaylab.wrongexample;

import javax.inject.Inject;

/**
 * Created by jjkim on 2016. 5. 29..
 */
public class Car {
    @Inject Weather weather;
    Road road;

    @Inject
    public Car() {
        weather = Syringe.getInstance().provideWeahter();
    }

    public void setRoad(Road road) {
        this.road = road;
    }

    public void drive() {
        if(road.canGo()) {
            System.out.println("I'm driving on " + road);
        } else {
            System.out.println("I can't drive on " + road);
        }

        weather.printWeather();
    }

    public void stop() {
        System.out.println("I stop on " + road);
        weather.printWeather();
    }
}
