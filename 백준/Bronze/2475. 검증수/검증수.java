import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        int g = multi(a) + multi(b) + multi(c) + multi(d) + multi(e);
        
        int result = g % 10;

        System.out.println(result);
    }
    public static int multi(int num){
        int result = num * num;
        return result;
    }
}