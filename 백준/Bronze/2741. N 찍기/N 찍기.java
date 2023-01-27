import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        a = sc.nextInt();
        printNumber(a);
    }
    public static void printNumber(int num){
        for(int i = 0; i < num ; i ++){
            int result = i + 1;
            System.out.println(result);
        }
    }
}