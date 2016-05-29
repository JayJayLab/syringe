package com.github.jayjaylab.wrongexample;

import javax.inject.Inject;
import javax.inject.Named;

public class App {
    @Inject Car car;
    @Inject @Named("gangnam") Road road;
    @Inject Weather weather;

    public App() {
        car = Syringe.getInstance().provideCar();
        road = Syringe.getInstance().provideRoad();
        weather = Syringe.getInstance().provideWeahter();
    }

    public void run() {
        car.setRoad(road);

        weather.setState("raining");
        car.drive();
        weather.setState("cloudy");
        car.stop();
    }

    public static void main(String[] args ) {
        App app = new App();
        app.run();
    }
}
