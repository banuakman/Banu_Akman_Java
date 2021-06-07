package com.banuakman;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    @Test
    public void shouldReturnMonthUsingIf() {
        ConverterIf converter = new ConverterIf();
        String whatIExpect = "June";
        String whatIGot = converter.convertMonth(6);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnDayUsingIf() {
        ConverterIf converter = new ConverterIf();
        String whatIExpect = "Sunday";
        String whatIGot = converter.convertDay(1);
        assertEquals(whatIExpect, whatIGot);
    }

}