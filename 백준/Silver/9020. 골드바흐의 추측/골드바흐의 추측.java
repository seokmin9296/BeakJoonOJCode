import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
        ArrayList<Integer> primes = generatePrimes(n);
        int minDiff = n;
        int[] pairs = new int[2];
        for(int i = 0 ; i < primes.size() ; i ++){
            int p = primes.get(i);
            if(p > n / 2){
                break;
            }
            int q = n - p;
            if(isPrime(q)){
                int diff = q - p;
                if(diff < minDiff){
                    pairs[0] = p;
                    pairs[1] = q;
                }
            }
        }
        System.out.println(pairs[0] + " " + pairs[1]);
    }
    public static ArrayList<Integer> generatePrimes(int n){
        boolean[] isComposite = new boolean[n + 1];
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i = 2 ; i <= n ; i ++){
            if(!isComposite[i]){
                primes.add(i);
                for(int j = i * i ; j <= n; j += i){
                    isComposite[j] = true;
                }
            }
        }
        return primes;
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