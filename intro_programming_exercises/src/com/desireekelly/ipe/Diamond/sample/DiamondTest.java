package com.desireekelly.ipe.Diamond.sample;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class DiamondTest {

    private LineService lineService;
    private Diamond diamond;

    @Before
    public void setUp() {
        lineService = mock(LineService.class);
        diamond = new Diamond(lineService);
    }

    @Test
    public void shouldDelegateToLineServiceToGetLine() {
        when(lineService.getLine(anyInt())).thenReturn("");

        String triangle = diamond.getDiamond(1);

        verify(lineService).getLine(anyInt());
        assertEquals(triangle, "");
    }

    @Test
    public void shouldAssembleTriangleCorrectly() {
        when(lineService.getLine(1)).thenReturn(" * ");
        when(lineService.getLine(2)).thenReturn("***");

        String triangle = diamond.getDiamond(2);
        assertEquals(triangle, " * \n" + "***\n");
    }
}