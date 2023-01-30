import java.util.*;
public class Main{
    public static void main(String args[]) {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        String a = "";
        String result = "";
        int n = 0;
        n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i ++){
            a = sc.nextLine();
            result = a.toLowerCase();
            System.out.println(result);
        }
    }
}