import java.io.IOException;
import java.util.*;
public class Main{

    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int num = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < 9 ; i ++){
            int m = sc.nextInt();

            map.put(i, m);
        }
        for(int i = 0 ; i < map.size(); i ++){
            if(max < map.get(i)){
                max = map.get(i);
                num = i+1;
            }
        }

        System.out.println(max);
        System.out.println(num);
        sc.close();
    }
}