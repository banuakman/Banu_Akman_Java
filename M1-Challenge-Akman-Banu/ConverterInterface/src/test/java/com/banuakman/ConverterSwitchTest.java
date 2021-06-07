package com.banuakman;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    @Test
    public void shouldReturnMonthUsingSwitch() {
        ConverterSwitch converter = new ConverterSwitch();
        String whatIExpect = "June";
        String whatIGot = converter.convertMonth(6);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnDayUsingSwitch() {
        ConverterSwitch converter = new ConverterSwitch();
        String whatIExpect = "Sunday";
        String whatIGot = converter.convertDay(1);
        assertEquals(whatIExpect, whatIGot);
    }
}