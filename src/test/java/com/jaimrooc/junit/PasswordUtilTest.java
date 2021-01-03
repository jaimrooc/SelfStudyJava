package com.jaimrooc.junit;

import org.junit.Test;

import static com.jaimrooc.junit.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.assertEquals;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }
    @Test
    public void weak_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd1234"));
    }
    @Test
    public void strong_when_has_letters_and_numbers_and_symbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd1234!"));
    }


}