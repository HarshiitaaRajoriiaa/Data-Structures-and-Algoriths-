//?https://leetcode.com/problems/jewels-and-stones/

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i = 0 ; i< stones.length();i++){
            String curr = String.valueOf(stones.charAt(i));
           if(jewels.contains(curr)) count++;
        }
        return count;
    }
    public int numJewelsInStones2(String jewels, String stones) {
        int count=0;
        Set <Character> jewelset = new HashSet<>();
        for(int i = 0 ; i < jewels.length();i++){
            jewelset.add(jewels.charAt(i));
        }
        for(int i = 0; i <stones.length();i++){
            if(jewelset.contains(stones.charAt(i))) count++;
        }
        return count;
    }
}
