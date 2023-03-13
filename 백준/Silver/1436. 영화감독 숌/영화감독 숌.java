import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        scan();
    }

    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int num = 665;
        while (cnt < n){
            num++;
            if(String.valueOf(num).contains("666")){
                cnt++;
            }
        }
        
        bw.write(String.valueOf(num));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}