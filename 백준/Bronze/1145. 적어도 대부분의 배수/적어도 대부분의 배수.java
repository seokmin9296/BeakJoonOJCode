import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;


public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] nums = s.split(" ");
        int[] intNums = Stream.of(nums).mapToInt(Integer::parseInt).toArray();
        int max = 100 * 99 * 98;
        int result = -1;
        for(int i = Arrays.stream(intNums).min().getAsInt(); i < max ; i ++){
            int cnt = 0;
            for(int j = 0 ; j < nums.length ; j ++){
                if(i % Integer.parseInt(nums[j]) == 0) cnt ++;
            }
            if(cnt >= 3){
                result = i;
                break;
            }
        }
        br.close();
        System.out.println(result);
    }
}