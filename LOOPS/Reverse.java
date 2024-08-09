package LOOPS;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(1234));  // Output will be 4321
    }
    public static int reverse(int N) {
        String n = String.valueOf(N);
        int l = n.length();
        // Convert String to char array
        char[] str = n.toCharArray();
        
        // Swap characters to reverse the array
        for (int i = 0; i < l / 2; i++) {
            char temp = str[i];
            str[i] = str[l - 1 - i];
            str[l - 1 - i] = temp;
        }
        // Convert char array back to String
        String reversedStr = new String(str);
        // Convert String back to int
        return Integer.valueOf(reversedStr);
    }
}
