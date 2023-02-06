import java.util.*;
class Solution {
int len = 0;
    public int[] solution(String today, String[] terms, String[] privacies) {
        len = privacies.length;
        HashMap<String, Integer> term = new HashMap<>();
        int[] expireTerm = new int[len];

        ArrayList<Integer> list = new ArrayList<>();
        int now = cal(today);
        for(String x : terms){
            term.put(x.split(" ")[0], Integer.parseInt(x.split(" ")[1]) * 28);
        }
        for(int i = 0 ; i < len ; i ++){
            int day = cal(privacies[i].split(" ")[0]);
            String key = privacies[i].split(" ")[1];
            expireTerm[i] = day + term.get(key);
            if(expireTerm[i] <= now){
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(x->x).toArray();
    }
    public static int cal(String today){
        int y = Integer.parseInt(today.split("\\.")[0]);
        int m = Integer.parseInt(today.split("\\.")[1]);
        int d = Integer.parseInt(today.split("\\.")[2]);

        return d + m * 28 + (y-2000) * 12 * 28;
    }
}