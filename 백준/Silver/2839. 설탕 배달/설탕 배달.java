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

        System.out.println(minBoxes(n));
    }

    public static int minBoxes(int n){
        int boxA = 0;
        int boxB = n / 5;

        int remain = n % 5;

        while (boxB >= 0){
            if(remain % 3 == 0){
                boxA = remain / 3;
                return boxB + boxA;
            }else{
                boxB --;
                remain += 5;
            }
        }
        return -1;
    }
}