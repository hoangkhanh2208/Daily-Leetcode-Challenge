package Array;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };

        // rotate(a, 3);
        rotateWithTwoPoiter(a, 3);
    }
    
    public static void rotate(int[] a, int k) {
        int n = a.length;
        int j = 0;
        if (n < 2) {
            return;
        }
        while (j < k) {
            int temp = a[0];
            a[0] = a[n - 1];
            for (int i = n - 2; i > 0; i--) {
                a[i + 1] = a[i];
            }
            a[1] = temp;
            j++;
        }

    }
    
    public static void rotateWithTwoPoiter(int[] nums, int k) {
        if (nums.length == 0)
            return;
        int n = nums.length;
        while ((k %= n) > 0 && n > 1) {
            int range = n - k;
            for (int i = 1; i <= range; i++) {
                int val = nums[n - i];
                nums[n - i] = nums[n - i - k];
                nums[n - i - k] = val;
            }
            n = k;
            k = n - (range % k);
        }
    }
}
