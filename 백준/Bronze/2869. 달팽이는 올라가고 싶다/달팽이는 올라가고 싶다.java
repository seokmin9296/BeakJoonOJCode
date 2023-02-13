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
        climb(Long.parseLong(nums[0]), Long.parseLong(nums[1]), Long.parseLong(nums[2]))
        );
    }
    public static int climb(long a, long b, long c){
        long speed = a - b;
        long distance = c - a;
        double days = (double) distance / speed;
        int result = (int)Math.ceil(days) + 1;
        return result;
    }
}