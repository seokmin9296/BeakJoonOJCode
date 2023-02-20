import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        isPrimeFacto(n);
    }

    public static void isPrimeFacto(int n) {
        while (n % 2 == 0){
            System.out.println(2);
            n /= 2;
        }
        for(int i = 3 ; i <= Math.sqrt(n); i += 2){
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        if(n > 2){
            System.out.println(n);
        }
    }
}