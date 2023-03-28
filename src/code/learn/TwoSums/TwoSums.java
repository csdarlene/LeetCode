package code.learn.TwoSums;

import java.util.Arrays;

public class TwoSums {
    public static String twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] result = new int[2];
        int i = 0;
        while (i < size) {
            for (int a : nums) {
                if (nums[i] == a) {
                    result[0] = i;
                    i++;
                    for (int b : nums) {
                        if (nums[i] == b) {
                            result[1] = i;
                            if (a + b == target) {
                                if (result[0] != result[1]) {
                                    return Arrays.toString(result);
                                }
                            }
                        }

                    }
                }

            }
        }
        return Arrays.toString(result);
    }


    public static String two(int[] nums, int target) {
        int size = nums.length;
        int[] result = new int[2];
        int i = 0;
        while (i < size) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return Arrays.toString(result);
                }
            }
            i++;
        }
        return Arrays.toString(result);
    }


    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{3, 2, 4}, 6));
        System.out.println(Sum(new int[]{2, 7, 11, 15}, 9));
        System.out.println(two(new int[]{3, 2, 3, 5}, 6));
    }

    public static String Sum(int[] nums, int target) {
        int size = nums.length;
        int[] result = new int[2];
        int i = 0;
            for (int j = i + 1; j < size; j++) {
                if (nums[i] + nums[j] == target) {
                    result[1] = j;
                    return Arrays.toString(result);
                }
            }

        return Arrays.toString(result);
    }

}