import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i ++){
            int m = Integer.parseInt(br.readLine());
            findPairs(m);
        }
    }

    public static void findPairs(int n){
        List<Integer> primes = new ArrayList<>();
        for(int i = 2 ; i <= n ; i ++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        int[] pair = new int[2];
        int minDiff = n;

        for(int i = 0 ; i < primes.size() ; i ++){
            for(int j = i ; j < primes.size() ; j ++){
                int sum = primes.get(i) + primes.get(j);
                if(sum == n){
                    int diff = primes.get(j) - primes.get(i);
                    if(diff < minDiff){
                        pair[0] = primes.get(i);
                        pair[1] = primes.get(j);
                        minDiff = diff;
                    }
                }
            }
        }
        System.out.println(pair[0] + " " + pair[1]);
    }

    public static boolean isPrime(int n) { // 소수 검증
        if(n <= 1){
            return false;
        }
        for(int i = 2 ; i <= Math.sqrt(n) ; i ++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}