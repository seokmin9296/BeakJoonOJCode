import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        List<Integer> result =  isPrime(n, m);
        if(result.size() == 0 ){
            System.out.println(-1);
        }else{
            System.out.println(result.stream().mapToInt(Integer::intValue).sum());
            System.out.println(result.get(0));
        }
    }

    public static List<Integer> isPrime(int n, int m) {// 에라토스테네스의 체 방식
        List<Integer> result = new ArrayList<>();
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
                result.add(i);
            }
        }
        return result;
    }
}