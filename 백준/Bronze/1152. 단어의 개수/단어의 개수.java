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
        String[] result = s.split(" ");
        int cnt = 0;
        for(int i = 0 ; i < result.length ; i ++){
            if(!(result[i].length() == 0)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}