import java.io.IOException;
import java.util.*;
public class Main{
    public static class Node{
        int o;
        Node(int o){
            this.o = o;
        }
    }

    public static List<Node> list = new ArrayList<>();
    //public static PriorityQueue<Integer> que = new PriorityQueue<>();
    public static Comparator<Node> comparator = new Comparator<Node>() {
        @Override
        public int compare(Node o1, Node o2) {
            return Integer.compare(o1.o, o2.o);
        }
    };

    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; i ++){
            int m = sc.nextInt();

            list.add(new Node(m));
        }
        Collections.sort(list, comparator);

        System.out.println(list.get(0).o);
        System.out.println(list.get(list.size()-1).o);
        sc.close();
    }
}