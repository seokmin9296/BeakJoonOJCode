import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = reverse(st.nextToken());
        int m = reverse(st.nextToken());


        int max = Math.max(n, m);


        System.out.println(max);
    }
    public static int reverse(String s){
        char[] result = new char[s.length()];
        for(int i = 0 ; i < result.length ; i ++){
            result[i] = s.charAt(result.length-1-i);
        }
        int resultInt = Integer.parseInt(String.valueOf(result));
        return resultInt;
    }
}