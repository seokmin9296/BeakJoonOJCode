import java.util.*;
public class Main{
    public static void main(String args[]) {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        long a, b;
        while (true){
            a = sc.nextLong();
            b = sc.nextLong();
            if(a == 0 && b == 0) break;
            isBig(a, b);
        }
    }
    public static void isBig(long a, long b){
        String result = a > b ? "Yes" : "No";
        System.out.println(result);
    }
}