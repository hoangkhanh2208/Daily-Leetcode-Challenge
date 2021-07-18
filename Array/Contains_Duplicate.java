package Array;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1 };
        
        System.out.println(containsDuplicate(a));
    }
    
    public static boolean containsDuplicate(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
