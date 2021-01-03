package com.jaimrooc.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void notIsEmpty_when_anyStringIsNotEmpty() {
        assertFalse(StringUtil.isEmpty("Hello!! "));
    }

    @Test
    public void IsEmpty_when_sendStringWithoutValue() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void IsEmpty_when_sendNullValue() {
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void IsEmpty_when_sendNullStringValue() {
        assertTrue(StringUtil.isEmpty("null"));
    }

    @Test
    public void IsEmpty_when_sendEmptyStringWithSpace() {
        assertTrue(StringUtil.isEmpty(" "));
    }

}