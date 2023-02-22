import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = br.readLine();
            if(s.equals("-1"))break;
            int n = Integer.parseInt(s);
            System.out.println(factors(n));
        }
    }
    public static String factors(int a) {
        int cnt = 0;
        String result = "";
        List<Integer> list = new ArrayList<>();
        for(int i = 1 ; i < a; i++){
            if(a % i == 0){
                cnt += i;
                list.add(i);
            }
        }
        if(cnt == a){
            StringBuilder sb = new StringBuilder();
            sb.append(a + " = 1");
            for(int i = 1 ; i < list.size() ; i ++){
                sb.append(" + "+list.get(i));
                result = sb.toString();
            }
        }else{
            result = a + " is NOT perfect.";
        }
        return result;
    }
}