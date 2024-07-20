package STRINGS;

public class Reverse {
    public void reverseString(char[] s) {
        if(s.length<=0){
            System.out.println("-1");
        }
        int p1 = 0;
        int p2 = s.length-1;
        while(p1<p2){
            char temp =  s[p1];
            s[p1] = s[p2];
            s[p2] = temp;
            p1++;
            p2--;
        }
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
