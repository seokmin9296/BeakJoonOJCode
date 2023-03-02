import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<int[]> coordinates = new ArrayList<>();

        for(int i = 0 ; i < n ; i ++){
            String[] s = br.readLine().split(" ");
            coordinates.add(findArray(s));
        }

        int[][] result = coordinates.toArray(new int [1][n]);

        Arrays.sort(result, (a, b) -> {
            if(a[0] != b[0]){
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });

        for(int i = 0 ; i < n ; i ++){
            bw.write(result[i][0]+ " " + result[i][1] + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static int[] findArray(String[] s) {
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int[] coordinate = {x, y};
        return coordinate;
    }
}