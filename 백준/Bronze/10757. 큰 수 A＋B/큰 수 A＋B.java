import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] numbers = s.split(" ");
        BigInteger a = new BigInteger(numbers[0]);
        BigInteger b = new BigInteger(numbers[1]);

        System.out.println(a.add(b));
    }
}