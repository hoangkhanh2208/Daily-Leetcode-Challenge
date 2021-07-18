package Array;

import java.util.ArrayList;
import java.util.List;

public class Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 }, index = { 0, 1, 2, 2, 1 };

        createTargetArray1(nums, index);
    }

    public static int[] createTargetArray1(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }

        for (int i = 0; i < target.size(); i++)
            nums[i] = target.get(i);

        return nums;
    }
    
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (index[i] >= i) {
                target[index[i]] = nums[i];
            } else {
                for (int j = target.length - 1; j > index[i]; j--) {
                    target[j] = target[j - 1];
                }
                target[index[i]] = nums[i];
            }
        }

        return target;
    }
}
