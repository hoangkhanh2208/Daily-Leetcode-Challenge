package String;

public class Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String[] word1 = { "abc", "d", "defg"};
        String[] word2 = { "abcddefg" };

        arrayStringsAreEqual(word1, word2);

    }
    
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return (String.join("", word1)).equals((String.join("", word2)));
    }
}
