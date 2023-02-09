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

        System.out.println(Rev(String.valueOf(Rev(nums[0])+Rev(nums[1]))));
    }
    public static int Rev(String s){
        char[] nums = s.toCharArray();

        int result = 0;
        for(int i = 0 ; i < nums.length ; i ++){
            result += (int)Math.pow(10, i) * (nums[i] - '0');
        }
        return result;
    }
}