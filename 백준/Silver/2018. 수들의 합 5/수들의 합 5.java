import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int start = 0;
        int end = 0;
        int sum = 0;
        int cnt = 0;
        while (start <= n){
            while (++end <= n){
                sum += end;
                if(sum >= n){
                    if(sum == n) cnt ++;
                    break;
                }
            }
            while (++start <= n){
                sum -= start;
                if(sum <= n){
                    if(sum == n) cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}