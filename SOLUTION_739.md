# LeetCode Problem 739: Daily Temperatures

## Problem Description
Given an array of integers `temperatures` represents the daily temperatures, return an array `answer` such that `answer[i]` is the number of days you have to wait after the `i`th day to get a warmer temperature. If there is no future day for which this is possible, keep `answer[i] == 0` instead.

## Solution Approach
The solution uses a **monotonic decreasing stack** to efficiently solve this problem in O(n) time complexity.

### Algorithm
1. Initialize an empty stack to store indices of temperatures
2. Initialize an answer array with all zeros
3. For each day (index i):
   - While the stack is not empty and the current temperature is greater than the temperature at the index on top of the stack:
     - Pop the index from the stack
     - Calculate the difference between current index and popped index
     - Store this difference in the answer array at the popped index position
   - Push the current index onto the stack
4. Return the answer array

### Time Complexity
- **O(n)** where n is the length of the temperatures array
- Each element is pushed and popped from the stack at most once

### Space Complexity
- **O(n)** for the stack in the worst case (when temperatures are in decreasing order)

## Examples

### Example 1
```
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Explanation:
- Day 0 (73°): Next warmer day is day 1 (74°) → wait 1 day
- Day 1 (74°): Next warmer day is day 2 (75°) → wait 1 day
- Day 2 (75°): Next warmer day is day 6 (76°) → wait 4 days
- Day 3 (71°): Next warmer day is day 5 (72°) → wait 2 days
- Day 4 (69°): Next warmer day is day 5 (72°) → wait 1 day
- Day 5 (72°): Next warmer day is day 6 (76°) → wait 1 day
- Day 6 (76°): No warmer day → 0
- Day 7 (73°): No warmer day → 0
```

### Example 2
```
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
```

### Example 3
```
Input: temperatures = [30,60,90]
Output: [1,1,0]
```

## Implementation Details
The implementation is located in:
- **Source**: `app/src/main/java/com/htetznaing/adbotg/Utils/DailyTemperatures.java`
- **Tests**: `app/src/test/java/com/htetznaing/adbotg/Utils/DailyTemperaturesTest.java`

## Test Coverage
The solution includes comprehensive test cases covering:
- Standard examples from LeetCode
- Edge cases (single element, empty array, null array)
- Monotonic sequences (all increasing, all decreasing)

All tests pass successfully! ✓
