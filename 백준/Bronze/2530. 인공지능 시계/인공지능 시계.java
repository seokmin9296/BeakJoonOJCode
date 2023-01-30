import java.util.*;
public class Main{
    public static void main(String args[]) {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        int a, b, c, d = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        duration(a, b, c, d);
        sc.close();
    }
    public static void duration(int a, int b, int c, int d) {
        int hour, min, sec;
        sec = c + d;
        min = b;
        hour = a;
        while (sec >= 60){
            sec -= 60;
            min++;
        }
        while (min >= 60){
            min -= 60;
            hour++;
        }
        while (hour >= 24){
            hour -= 24;
        }
        String time = hour + " " + min + " " + sec;
        System.out.println(time);
    }
}