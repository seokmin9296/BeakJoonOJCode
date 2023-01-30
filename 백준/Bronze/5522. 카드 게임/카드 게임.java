import java.util.*;
public class Main{
    public static void main(String args[]) {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        for(int i = 0 ; i < 5 ; i ++){
            a = sc.nextInt();
            b += a;
        }
        System.out.println(b);
    }
}