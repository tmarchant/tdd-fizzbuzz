package com.jl.tdd;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ThingTest {

    @Test
    public void thingShouldNotBeNull() {
        FizzBuzz thing = new FizzBuzz();

        assertNotNull(thing);
    }
}
