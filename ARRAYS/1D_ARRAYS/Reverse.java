
public class Reverse {
    public static void main(String[] args) {
        char s[] = { 'h', 'r', 'e', 'p' };
        reverseString(s);

    }

    public static void reverseString(char[] s) {
        if (s.length <= 0) {
            System.out.println("-1");
        }
        int pointer1 = 0;
        int pointer2 = s.length - 1;
        while (pointer1 < pointer2) {
            char temp = s[pointer1];
            s[pointer1] = s[pointer2];
            s[pointer2] = temp;
            pointer1++;
            pointer2--;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
