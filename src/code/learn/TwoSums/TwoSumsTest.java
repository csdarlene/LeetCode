package code.learn.TwoSums;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumsTest {
TwoSums sums= new TwoSums();
    @org.junit.jupiter.api.Test
    public void twoSum() {
        assertEquals("[1, 2]", sums.twoSum(new int[]{3, 2, 4}, 6));
        assertEquals("[0, 1]", sums.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @org.junit.jupiter.api.Test
    void two() {
        assertEquals("[1, 2]", sums.Sum(new int[]{3, 2, 4}, 6));
        assertEquals("[0, 1]", sums.Sum(new int[]{2, 7, 11, 15}, 9));
        assertEquals("[0, 2]", sums.Sum(new int[]{3, 2, 3, 5}, 6));

    }

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals("[1, 2]", sums.two(new int[]{3, 2, 4}, 6));
        assertEquals("[0, 1]", sums.two(new int[]{2, 7, 11, 15}, 9));
        assertEquals("[0, 2]", sums.two(new int[]{3, 2, 3, 5}, 6));

    }
}
