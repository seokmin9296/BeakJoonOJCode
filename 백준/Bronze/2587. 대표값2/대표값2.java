import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];
        for(int i = 0 ; i < 5 ; i ++){
            int m = Integer.parseInt(br.readLine());
            numbers[i] = m;
        }
        average(numbers);
        sortMid(numbers);
    }
    public static void average(int[] a) {
        OptionalDouble average = Arrays.stream(a).average();
        int intValue = (int) average.orElse(0.0);
        System.out.println(intValue);
    }
    public static void sortMid(int[] a){
        Arrays.sort(a);
        System.out.println(a[2]);
    }
}