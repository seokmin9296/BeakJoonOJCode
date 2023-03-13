import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        scan();
    }

    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(decompose(num)));
        bw.newLine();
        bw.flush();
        bw.close();
    }

    public static int decompose(int n) {
        int result = 0;

        for (int i = 1 ; i <= n ; i ++ ){
            int sum = i;
            int num = i;
            while (num > 0){
                sum += num % 10;
                num /= 10;
            }
            if(sum == n){
                result = i;
                break;
            }
        }
        return result;
    }
}