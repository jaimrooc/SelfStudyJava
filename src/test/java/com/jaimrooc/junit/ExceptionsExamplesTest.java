package com.jaimrooc.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionsExamplesTest {

    @Test(expected = IllegalArgumentException.class)
    public void exception_when_negative_times() {
        ExceptionsExamples.repeat("hi", -1);
    }

}