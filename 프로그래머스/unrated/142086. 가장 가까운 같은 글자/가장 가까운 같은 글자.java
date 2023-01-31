
import java.util.*;

public class Solution {
    public static int[] solution(String s){
        int[] result = new int[s.length()];

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(!map.containsKey(s.charAt(i))){
                result[i] = -1;
                map.put(s.charAt(i), i);
            }else{
                int beforeNum = map.get(s.charAt(i));
                result[i] = i - beforeNum;
                map.put(s.charAt(i), i);
            }
        }
        
        
        return result;
    }
}
