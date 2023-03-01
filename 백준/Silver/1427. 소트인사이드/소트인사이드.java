import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();

        bw.write(doSort(num));
        bw.flush();
        bw.close();
    }

    public static String doSort(String num) {
        char[] numChars = num.toCharArray();

        int[] nums = new int[numChars.length];

        for(int i = 0 ; i < numChars.length ; i ++){
            nums[i] = numChars[i] - '0';
        }

        Arrays.sort(nums);

        int[] descending = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i ++){
            descending[i] = nums[nums.length - 1 - i];
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < descending.length ; i ++){
            sb.append(descending[i]);
        }

        return sb.toString();
    }
}