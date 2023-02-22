import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = br.readLine();
            if(s.equals("0 0"))break;
            String[] str = s.split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            System.out.println(classification(n, m));
        }

    }
    public static String classification(int a, int b){
        if(a < b){
            if(b % a == 0){
                return "factor";
            }
        }else{
            if(a % b ==0){
                return "multiple";
            }
        }
        return "neither";
    }
}