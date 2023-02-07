import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[]arr = new int[26];

        for(int i = 0 ; i < arr.length ; i ++){
            arr[i] = -1;
        }

        String s = br.readLine();

        for(int i = 0 ; i < s.length() ; i ++){
            char c = s.charAt(i);
            if(arr[c - 'a'] == -1){
                arr[c - 'a'] = i;
            }
        }
        for(int result : arr){
            System.out.println(result);
        }
    }
}