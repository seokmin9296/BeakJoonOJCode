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
        String[] nums = s.split(" ");
        System.out.println(
        bePoint(Long.parseLong(nums[0]), Long.parseLong(nums[1]), Long.parseLong(nums[2]))
        );
    }
    public static int bePoint(long a, long b, long c){
        int result = 0;
        int cnt = 0;

        long sumBenefit = 0;

        if(b >= c){
            result = -1;
        }else{
            long benefit = c - b;
            while (a >= sumBenefit){
                cnt++;
                sumBenefit += benefit;
            }
            result = cnt;
        }

        return result;
    }
}