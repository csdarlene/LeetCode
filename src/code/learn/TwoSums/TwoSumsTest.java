package code.learn.TwoSums;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumsTest {
    @org.junit.jupiter.api.Test
    public void twoSum() {
        assertEquals("[1, 2]", TwoSums.twoSum(new int[]{3, 2, 4}, 6));
        assertEquals("[0, 1]", TwoSums.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @org.junit.jupiter.api.Test
    void two() {
        assertEquals("[1, 2]", TwoSums.Sum(new int[]{3, 2, 4}, 6));
        assertEquals("[0, 1]", TwoSums.Sum(new int[]{2, 7, 11, 15}, 9));
        assertEquals("[0, 2]", TwoSums.Sum(new int[]{3, 2, 3, 5}, 6));

    }

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals("[1, 2]", TwoSums.two(new int[]{3, 2, 4}, 6));
        assertEquals("[0, 1]", TwoSums.two(new int[]{2, 7, 11, 15}, 9));
        assertEquals("[0, 2]", TwoSums.two(new int[]{3, 2, 3, 5}, 6));

    }
}
