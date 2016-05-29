package com.github.jayjaylab.wrongexample;

/**
 * Created by jjkim on 2016. 5. 29..
 */
public class GangnamRoad implements Road {
    public boolean canGo() {
        return true;
    }

    @Override
    public String toString() {
        return GangnamRoad.class.getSimpleName();
    }
}
