package com.htetznaing.adbotg.Utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for DailyTemperatures solution
 */
public class DailyTemperaturesTest {

    @Test
    public void testExample1() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        int[] result = DailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testExample2() {
        int[] temperatures = {30, 40, 50, 60};
        int[] expected = {1, 1, 1, 0};
        int[] result = DailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testExample3() {
        int[] temperatures = {30, 60, 90};
        int[] expected = {1, 1, 0};
        int[] result = DailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSingleElement() {
        int[] temperatures = {100};
        int[] expected = {0};
        int[] result = DailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDecreasingTemperatures() {
        int[] temperatures = {90, 80, 70, 60, 50};
        int[] expected = {0, 0, 0, 0, 0};
        int[] result = DailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testIncreasingTemperatures() {
        int[] temperatures = {50, 60, 70, 80, 90};
        int[] expected = {1, 1, 1, 1, 0};
        int[] result = DailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testEmptyArray() {
        int[] temperatures = {};
        int[] expected = {};
        int[] result = DailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testNullArray() {
        int[] temperatures = null;
        int[] expected = {};
        int[] result = DailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }
}
