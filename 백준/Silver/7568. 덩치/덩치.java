import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        scan();
    }

    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][2];
        for(int i = 0 ; i < num ; i++){
            int[] size = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            arr[i][0] = size[0];
            arr[i][1] = size[1];
        }

        bw.write(size(arr, num));
        bw.newLine();
        bw.flush();
        bw.close();
    }

    public static String size(int[][] n, int m) {
        StringBuilder result = new StringBuilder();

        for( int i = 0 ; i < m ; i ++){
            int rank = 1;
            for(int j = 0 ; j < m ; j ++){
                if(n[i][0] < n[j][0] && n[i][1] < n[j][1]){
                    rank++;
                }
            }
            result.append(rank+" ");
        }
        return result.toString();
    }
}