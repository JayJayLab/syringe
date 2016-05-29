package com.github.jayjaylab.wrongexample;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jjkim on 2016. 5. 29..
 */
public class Syringe {
    static Syringe instance;
    Map<Class<?>, Object> singletonCache;

    private Syringe() {
        singletonCache = new HashMap<Class<?>, Object>(100, 0.75f);
    }

    public static Syringe getInstance() {
        if(instance == null) {
            synchronized (Syringe.class) {
                if(instance == null) {
                    instance = new Syringe();
                }
            }
        }

        return instance;
    }

    public Weather provideWeahter() {
        Object object = singletonCache.get(Weather.class);
        if(object == null) {
            synchronized (Weather.class) {
                if((object = singletonCache.get(Weather.class)) == null) {
                    object = new Weather();
                    singletonCache.put(Weather.class, object);
                }
            }
        }

        return (Weather)object;
    }

    public Car provideCar() {
        return new Car();
    }

    public GangnamRoad provideRoad() {
        return new GangnamRoad();
    }
}
