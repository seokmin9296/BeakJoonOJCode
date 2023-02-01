import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0 ; i < n ; i ++){
            int o = sc.nextInt();
            if( o < m){
                System.out.println(o);
            }
        }
        sc.close();
    }
}