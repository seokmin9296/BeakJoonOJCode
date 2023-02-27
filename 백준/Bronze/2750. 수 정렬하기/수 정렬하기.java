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
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        for(int i = 0 ; i < n ; i ++){
            int m = Integer.parseInt(br.readLine());
            numbers[i] = m;
        }
        sortAsc(numbers);
    }
    public static void sortAsc(int[] a) {
        Arrays.sort(a);
        for(int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }
    }
}