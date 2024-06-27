package QuestionsFromPlatforms.CodeForces;
import java.util.*;
public class WaterConsumption {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t--> 0){
            int water = s.nextInt();
            if(water>=2000){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
