package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Count_the_Number_of_Consistent_Strings {
    public static void main(String[] args) {
        String allowed = "abc";

        String[] words = { "a", "b", "c", "ab", "ac", "bc", "abc" };
        countConsistentStrings(allowed, words);
    }
    
    // public static String sortedString(String value) {
    //     char tempArray[] = value.toCharArray();
    //     Arrays.sort(tempArray);
    //     return new String(tempArray);
    // }
    
    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedLetters = new HashSet<>(); 

	    for(char letter : allowed.toCharArray())
	    {
		    allowedLetters.add(letter);
	    }

        int count = 0;

        for (String s : words) {
            for (int i = 0; i < s.length(); i++) {
                if (!allowedLetters.contains(s.charAt(i))) {
                    break;
                }
                if (i == s.length() - 1) {
                    count++;
                }
            }
        }

        return count;
    }

    // public static String removeDuplicate(char str[]) {
    //     int index = 0;

    //     // Traverse through all characters
    //     for (int i = 0; i < str.length; i++) {

    //         // Check if str[i] is present before it
    //         int j;
    //         for (j = 0; j < i; j++) {
    //             if (str[i] == str[j]) {
    //                 break;
    //             }
    //         }

    //         // If not present, then add it to
    //         // result.
    //         if (j == i) {
    //             str[index++] = str[i];
    //         }
    //     }
    //     return String.valueOf(Arrays.copyOf(str, index));
    // }
}
