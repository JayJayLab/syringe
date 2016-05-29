package com.github.jayjaylab.syringe;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by jjkim on 2016. 5. 28..
 */
public class TestSyringe {
    Syringe syringe;

    @Before
    public void setUp() {
        syringe = new Syringe();
    }

    @Test
    public void testA() {
        syringe.a();
    }
}
