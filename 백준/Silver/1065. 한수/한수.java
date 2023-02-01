import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        result = hanSu(n);
        System.out.println(result.size());

        sc.close();
    }
    public static List<Integer> hanSu(int n){
        List<Integer> result = new ArrayList<>();
        int h, t, o;

        for(int i = 1 ; i <= n ; i++){
            h = (i/100)%10;
            t = (i/10)%10;
            o = i%10;
            if(i < 100){
                result.add(i);
            }
            if(i >= 100 && i < 1000 && (h-t)==(t-o)){
                result.add(i);
            }
        }
        return result;
    }
}