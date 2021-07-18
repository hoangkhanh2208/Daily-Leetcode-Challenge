package String;

public class Sorting_the_Sentence {
    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        sortSentence(s);
    }

    public static String sortSentence(String s) {
        String[] a = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int x = 1;
        int i = 0;
        while (i < a.length) {
            for (String str : a) {
                String c = String.valueOf(x);
                if (str.contains(c)) {
                    String d = str.replace(c, " ");
                    sb.append(d);
                    x++;
                    break;
                }
            }
            i++;
        }
        return sb.substring(0, sb.length() - 1);
    }
}
