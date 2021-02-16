package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    App app;
    @Before
    public void setUp() {
        app = new App();
    }
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void add() {
        int expected=4;
        int actual=app.add(2,2);
        assertEquals(expected,actual);
    }

    @Test
    public void subtract() {
        int expected=4;
        int actual=app.subtract(6,2);
        assertEquals(expected,actual);
    }

    @Test
    public void multiply() {
        int expected=4;
        int actual=app.multiply(2,2);
        assertEquals(expected,actual);
    }

    @Test
    public void divide() {
        int expected=2;
        int actual=app.divide(4,2);
        assertEquals(expected,actual);
    }

    @Test
    public void isPositive() {
          assertTrue(app.isPositive(1));
          assertFalse(app.isPositive(-1));
          assertTrue(app.isPositive(0));

    }
}
