import java.util.HashMap;
//https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class MostOccuring {
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        HashMap<Character, Integer> mp = new HashMap<>();
        char maxC = 'a';
        int max =0;
        for(int i=0;i<line.length();i++){
            mp.put(line.charAt(i) , mp.getOrDefault(line.charAt(i) , 0)  + 1);
            if(max < mp.get(line.charAt(i))){
                max = mp.get(line.charAt(i));
                maxC = line.charAt(i);
            }
            else if(max == mp.get(line.charAt(i))){
                if(maxC > line.charAt(i))  maxC = line.charAt(i);
            }
        }
        return maxC;
        
    }
}
