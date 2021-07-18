package Array;

public class Shuffle_the_Array {
    public static void main(String[] args) {
        int[] a = { 2, 5, 1, 3, 4, 7 };
        
        shuffle(a, 3);
    }
    
    public static int[] shuffle(int[] nums, int n) {
        int[] b = new int[nums.length];
        int k = 0;
        for (int i = 0; i < n; i++) {
            b[k] = nums[i];
            b[k + 1] = nums[i + n];
            k += 2;
        }

        return b;
    }
}
