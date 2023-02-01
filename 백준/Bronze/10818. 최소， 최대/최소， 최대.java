import java.io.IOException;
import java.util.*;
public class Main{

    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int min = 0;
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; i ++){
            int m = sc.nextInt();

            result.add(m);
        }
        max = result.get(0);
        min = result.get(0);
        for(int i = 0 ; i < result.size() ; i ++){
            if(max < result.get(i)){
                max = result.get(i);
            }
            if(min > result.get(i)){
                min = result.get(i);
            }
        }

        System.out.println(min);
        System.out.println(max);
        sc.close();
    }
}