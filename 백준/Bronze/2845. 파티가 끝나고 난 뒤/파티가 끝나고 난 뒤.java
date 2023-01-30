import java.util.*;
public class Main{
    public static void main(String args[]) {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f, g = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        g = sc.nextInt();

        int people = a * b;
        System.out.println(c - people);
        System.out.println(d - people);
        System.out.println(e - people);
        System.out.println(f - people);
        System.out.println(g - people);


        sc.close();
    }
}