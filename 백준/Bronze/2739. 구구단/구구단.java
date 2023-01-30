import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        guGu(a);
    }
    public static void guGu(int a){
        for(int i = 0 ; i < 9 ; i ++){
            String result = a + " * " + (i+1) + " = " + a * (i+1);
            System.out.println(result);
        }
    }
}