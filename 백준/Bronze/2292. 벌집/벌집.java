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
        System.out.println(
        throwRoom(Long.parseLong(s))
        );
    }
    public static int throwRoom(long a){
        int result = 0;
        long addNum = 1;
        long cnt = 1;
        while (a > addNum){
            addNum += cnt * 6;
            cnt++;
        }
        result = (int)cnt;
        return result;
    }
}