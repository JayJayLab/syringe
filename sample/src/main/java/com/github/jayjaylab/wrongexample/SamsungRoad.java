package com.github.jayjaylab.wrongexample;

/**
 * Created by jjkim on 2016. 5. 29..
 */
public class SamsungRoad implements Road {
    public boolean canGo() {
        return false;
    }

    @Override
    public String toString() {
        return SamsungRoad.class.getSimpleName();
    }
}
