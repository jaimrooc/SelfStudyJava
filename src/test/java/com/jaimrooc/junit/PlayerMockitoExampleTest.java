package com.jaimrooc.junit;

import com.jaimrooc.junit.mockitos.Dice;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerMockitoExampleTest {

    @Test
    public void looses_when_dice_number_is_too_low() {
        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(2);

        PlayerMockitoExample player = new PlayerMockitoExample(dice, 3);
        assertEquals(false, player.play());
    }

    @Test
    public void wins_when_dice_number_is_big() {
        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(4);

        PlayerMockitoExample player = new PlayerMockitoExample(dice, 3);
        assertTrue(player.play());
    }

}