package com.htetznaing.adbotg.Utils;

import java.util.Stack;

/**
 * Solution for LeetCode Problem 739: Daily Temperatures
 * 
 * Given an array of integers temperatures represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days you have 
 * to wait after the ith day to get a warmer temperature. If there is no future 
 * day for which this is possible, keep answer[i] == 0 instead.
 * 
 * Example 1:
 * Input: temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 * 
 * Example 2:
 * Input: temperatures = [30,40,50,60]
 * Output: [1,1,1,0]
 * 
 * Example 3:
 * Input: temperatures = [30,60,90]
 * Output: [1,1,0]
 */
public class DailyTemperatures {
    
    /**
     * Calculates the number of days until a warmer temperature for each day.
     * Uses a monotonic decreasing stack approach for O(n) time complexity.
     * 
     * @param temperatures array of daily temperatures
     * @return array where each element is the number of days to wait for a warmer temperature
     */
    public static int[] dailyTemperatures(int[] temperatures) {
        if (temperatures == null || temperatures.length == 0) {
            return new int[0];
        }
        
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        // Iterate through each day
        for (int i = 0; i < n; i++) {
            // While stack is not empty and current temperature is warmer than 
            // the temperature at the index on top of stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            // Push current index onto stack
            stack.push(i);
        }
        
        // Remaining indices in stack have no warmer day, answer already initialized to 0
        return answer;
    }
}
