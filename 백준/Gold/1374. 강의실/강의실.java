import java.io.IOException;
import java.util.*;
public class Main{
    public static class Node{
        int o, s, e;
        Node(int o, int s, int e){
            this.e = e;
            this.s = s;
            this.o = o;
        }
    }
    public static List<Node> list = new ArrayList<>();
    public static PriorityQueue<Integer> que = new PriorityQueue<>();
    public static Comparator<Node> comparator = new Comparator<Node>() {
        @Override
        public int compare(Node o1, Node o2) {
            return Integer.compare(o1.s, o2.s);
        }
    };


    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i ++){
            int o = sc.nextInt();
            int s = sc.nextInt();
            int e = sc.nextInt();

            list.add(new Node(o, s, e));
        }
        Collections.sort(list, comparator);

        int max = Integer.MIN_VALUE;

        for( int i = 0 ; i < n ; i ++){
            while (!que.isEmpty() && que.peek() <= list.get(i).s){
                que.poll();
            }
            que.add(list.get(i).e);
            max = Math.max(max, que.size());
        }
        System.out.println(max);
        sc.close();
    }

}