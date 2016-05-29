package com.github.jayjaylab.wrongexample;

import javax.inject.Inject;
import javax.inject.Named;

public class App {
    @Inject Car car;
    @Inject @Named("gangnam") Road gangnamRoad;
    @Inject @Named("samsung") Road samsungRoad;
    @Inject Weather weather;

    public App() {
        car = Syringe.getInstance().provideCar();
        gangnamRoad = Syringe.getInstance().provideGangnamRoad();
        samsungRoad = Syringe.getInstance().provideSamsungRoad();
        weather = Syringe.getInstance().provideWeahter();
    }

    public void run() {
        car.setRoad(gangnamRoad);
        weather.setState("raining");
        car.drive();
        weather.setState("cloudy");
        car.stop();

        car.setRoad(samsungRoad);
        car.drive();
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}
