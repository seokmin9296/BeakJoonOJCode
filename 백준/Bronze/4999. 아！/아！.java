import java.util.*;
public class Main{
    public static void main(String args[]) {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        String a, b;
        a = sc.nextLine();
        b = sc.nextLine();
        isGo(a, b);
    }
    public static void isGo(String a, String  b){
        String first = a.substring(0, a.length()-1);
        String second = b.substring(0, b.length()-1);
        String result = first.length() >= second.length() ? "go" : "no";
        System.out.println(result);

    }
}