package com.desireekelly.ipe.Diamond.sample;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LineServiceTest {

    private LineService lineService;

    @Test
    public void shouldReturnOneStarForTheFirstLine(){
        lineService = new LineService(1);
        assertEquals(lineService.getLine(1), "*");
    }

    @Test
    public void shouldCalculateCorrectLineContent(){
        lineService = new LineService(2);
        assertEquals(lineService.getLine(2), "***");
    }

    @Test
    public void shouldCalculateCorrectEmptySpaces() {
        lineService = new LineService(3);
        assertEquals(lineService.getLine(1), "  *  ");
        assertEquals(lineService.getLine(2), " *** ");
    }
}