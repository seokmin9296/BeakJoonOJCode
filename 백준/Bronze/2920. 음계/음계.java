import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String asc = "1 2 3 4 5 6 7 8";
        String dec = "8 7 6 5 4 3 2 1";
        String s = br.readLine();
        if(s.equals(asc)){
            System.out.println("ascending");
        } else if (s.equals(dec)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}