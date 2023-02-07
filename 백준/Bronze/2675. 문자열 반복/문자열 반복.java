import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());

        for(int k = 0; k < m ; k++){
            String s = br.readLine();
            String[] strs = s.split(" ");
            int n = Integer.parseInt(strs[0]);
            String str = strs[1];
            for(int j = 0 ; j < str.length() ; j++){
                for(int i = 0 ; i < n ; i ++){
                    char c = str.charAt(j);
                    System.out.print(String.valueOf(c));
                }
            }
            System.out.println();
        }
    }
}