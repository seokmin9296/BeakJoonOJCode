public class Solution {
    public static int[] solution(String s){
        int[] result = new int[s.length()];
        
        result[0] = -1;
        
        for(int i = 1; i < s.length(); i++){
            int num = s.lastIndexOf(s.substring(i, i+1), i-1);
            if(num != -1){
                result[i] = i - num;
            }else{
                result[i] = num;
            }

        }
        return result;
    }
}