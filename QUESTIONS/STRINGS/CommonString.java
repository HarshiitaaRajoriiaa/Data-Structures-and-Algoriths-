package QUESTIONS.STRINGS;
//https://leetcode.com/problems/greatest-common-divisor-of-strings/submissions/1321393843/?envType=study-plan-v2&envId=leetcode-75
public class CommonString {
 public static void main(String[] args) {
    
 }   
 public String gcdOfStrings(String str1, String str2) {
    if (!(str1 + str2).equals(str2 + str1)) {
        return "";
    }
    int gcdLength = gcd(str1.length(), str2.length());

    //part of string whch can divded both strings.
    return str1.substring(0, gcdLength);
}


//for calculating gcd.
private static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}
}


//notes:
/*
*The concatenation check (str1 + str2).equals(str2 + str1) ensures that both strings are composed of some common substring repeated multiple times.
* The GCD of the lengths of the two strings helps in determining the length of the largest common divisor string.
* Using the GCD length, extract substring from str1 or str2.
*/

