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
        while (true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0)break;
            isPrime(n);
        }
    }

    public static void isPrime(int n) {// 에라토스테네스의 체 방식
        boolean[] prime = new boolean[(n*2)+1];
        int cnt = 0;
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for( int i = 2 ; i <= Math.sqrt(n*2) ; i ++){
            if(prime[i]){
                for(int j = i * i ; j <= n*2 ; j += i){
                    prime[j] = false;
                }
            }
        }
        for(int i = n+1 ; i <= n*2 ; i ++){
            if(prime[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}