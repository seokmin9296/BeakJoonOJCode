import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = s.split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        System.out.println(factors(n, m));

    }
    public static int factors(int a, int b) {
        int cnt = 0;
        for(int i = 1 ; i <= a; i++){
            if(a%i == 0){
                cnt++;
                if(cnt == b){
                    return i;
                }
            }
        }
        return 0;
    }
}