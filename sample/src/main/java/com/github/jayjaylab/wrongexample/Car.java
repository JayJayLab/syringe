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
        if(road != null && road.canGo()) {
            System.out.println("I'm driving on " + road);
            weather.printWeather();
        }
    }

    public void stop() {
        if(road == null) {
            System.out.println("I stop");
            weather.printWeather();
        } else {
            System.out.println("I stop on " + road);
            weather.printWeather();
        }
    }
}
