package STRINGS;
//?https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
public class MergeStrings {
    public static void main(String[] args) {
        
    }
    public String mergeAlternatelyOptimized(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n1=word1.length();
        int n2=word2.length();
        int i=0;
        while(i<n1 || i<n2)
        {
           if(i<n1)
           sb.append(word1.charAt(i));
           if(i<n2)
           sb.append(word2.charAt(i));
           i++;
        }
        return sb.toString();  
       }
       
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j=  0;
        int l1=word1.length();
        int l2 = word2.length();
        StringBuilder merge = new StringBuilder(); //String is immutable hence stringBuilder is used.
        while(i < l1 && j < l2){
            merge.append(word1.charAt(i));
            merge.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i < l1 ){
            merge.append(word1.charAt(i));
            i++;
        }
        while( j < l2){
            merge.append(word2.charAt(j));
            j++;
        }
        return String.valueOf(merge);
    }
}
