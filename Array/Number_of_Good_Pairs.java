package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1, 1, 3 };

        numIdenticalPairs(a);
    }
    
    public static int numIdenticalPairs(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }


        return count;
    }
}
