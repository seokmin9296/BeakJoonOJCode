import java.util.*;
public class Main{
    public static void main(String args[]) {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        a = sc.nextInt();
        hap(a);
    }
    public static void hap(int a){
        int result = 0;
        for(int i = 1 ; i <= a ; i ++){
            result += i;
        }
        System.out.println(result);
    }
}