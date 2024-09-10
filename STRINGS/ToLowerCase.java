// package STRINGS;

//?https://leetcode.com/problems/to-lower-case/
public class ToLowerCase {
    public static void main(String[] args) {

    }

    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public String toLowerCase2(String s) {
        // every uppercase x - cooresponing lowercase x = -32
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                char c = (char) (s.charAt(i) + 32);
                a.append(c);
            } else
                a.append(s.charAt(i));
        }
        return a.toString();
    }
}
