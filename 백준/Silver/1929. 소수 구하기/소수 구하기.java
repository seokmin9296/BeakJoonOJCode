import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);
        isPrime(n, m);
    }

    public static void isPrime(int n, int m) {// 에라토스테네스의 체 방식
        boolean[] prime = new boolean[m+1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for( int i = 2 ; i <= Math.sqrt(m) ; i ++){
            if(prime[i]){
                for(int j = i * i ; j <= m ; j += i){
                    prime[j] = false;
                }
            }
        }
        for(int i = n ; i <= m ; i ++){
            if(prime[i]){
                System.out.println(i);
            }
        }
    }
}