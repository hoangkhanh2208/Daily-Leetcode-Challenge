package String;

import java.util.HashSet;
import java.util.Set;

public class Check_if_the_Sentence_Is_Pangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }
    
    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();

        for (Character c : sentence.toCharArray()) {
            set.add(c);
        }

        if(set.size() != 26){
            return false;
        }
        return true;
    }
}
