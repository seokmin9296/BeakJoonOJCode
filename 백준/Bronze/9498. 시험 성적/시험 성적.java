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
        if(n / 10 >= 9){
            System.out.println("A");
        } else if (n / 10 == 8) {
            System.out.println("B");
        } else if (n / 10 == 7) {
            System.out.println("C");
        } else if (n / 10 == 6) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}