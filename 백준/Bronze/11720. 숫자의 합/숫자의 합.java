import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int result = 0;

        for(byte value : br.readLine().getBytes()){
            result += (value - '0'); // ASCII코드 값을 반환하므로 '0'값을 빼야 원하는 값이 나옴
        }
        System.out.println(result);
    }
}