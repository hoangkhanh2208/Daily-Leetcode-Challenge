package Array;

import java.util.Arrays;

public class Single_Number {
    public static void main(String[] args) {
        int[] a = { 4,1,2,1,2};
        singleNumber(a);
    }
    
    public static int singleNumber(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[i + 1]) {
                return a[i];
            }
        }
        return 0;
    }
}
