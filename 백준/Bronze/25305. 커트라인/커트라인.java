import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int cutLine = Integer.parseInt(str[1]);

        String[] points = br.readLine().split(" ");
        int[] intPoint = Arrays.stream(points).mapToInt(Integer::parseInt).toArray();
        cutLine(intPoint, cutLine);
    }
    public static void cutLine(int[] a, int n) {
        Arrays.sort(a);
        Integer[] desc = new Integer[a.length];
        for(int i = 0 ; i < a.length ; i++){
            desc[i] = a[i];
        }
        Arrays.sort(desc , Collections.reverseOrder());
        System.out.println(desc[n-1]);
    }
}
