package RECURSION;
//https://leetcode.com/problems/reverse-string/description/
public class ReverseArray {
   public static void main(String[] args) {
      char s[] = {'e' , 'p' , 'i' , 'y'};
      reverse(s, 0, s.length-1);
      for (char c : s) {
         System.out.print(c + " ");
     }
      
   }
   public static void reverse(char s[] , int left, int right) {
      if(left >=right){
         return;
      }
      char temp = s[left];
      s[left] = s[right];
      s[right] = temp;
      reverse(s, left+1, right-1);
   }
}
