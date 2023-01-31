import java.util.*;

public class Solution {
    public static class Numbers{
        long a;
        Numbers(long a){
            this.a = a;
        }
    }
    public static List<Numbers> list = new ArrayList<>();
    public static PriorityQueue<Long> que = new PriorityQueue<>();
    public static Comparator<Numbers> comparator = new Comparator<Numbers>() {
        @Override
        public int compare(Numbers o1, Numbers o2) {
            return Long.compare(o1.a, o2.a);
        }
    };

    public int solution(String t, String p){
        for(int i = 0; i < t.length()-p.length()+1 ; i ++){
            String num = t.substring(i, i+p.length());
            long realNum = Long.parseLong(num);

            list.add(new Numbers(realNum));
        }
        Collections.sort(list, comparator);

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            while (!que.isEmpty() && list.get(i).a > Long.parseLong(p)){
                que.poll();
            }
            que.add(list.get(i).a);
            max = Math.max(max, que.size());
        }

        int answer = max;
        return answer;
    }
}
