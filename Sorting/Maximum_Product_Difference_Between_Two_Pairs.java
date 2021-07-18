package Sorting;

import java.util.Arrays;

public class Maximum_Product_Difference_Between_Two_Pairs {
    public static void main(String[] args) {
        int[] a = { 4, 2, 5, 9, 7, 4, 8 };
        maxProductDifference(a);
    }
    
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);     
    }
}
