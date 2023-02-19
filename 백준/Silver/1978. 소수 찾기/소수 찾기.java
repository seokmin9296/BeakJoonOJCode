import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        String[] s = br.readLine().split(" ");
        for(int i = 0 ; i < n ; i ++){
            nums[i] = Integer.parseInt(s[i]);
            if(isPrime(nums[i])){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean isPrime(int n){
        if ( n <= 1){
            return false;
        }
        for(int i = 2 ; i <= Math.sqrt(n) ; i ++){
            if(n % i  == 0){
                return false;
            }
        }
        return true;
    }
}