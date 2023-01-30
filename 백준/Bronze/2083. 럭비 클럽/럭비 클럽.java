import java.util.*;
public class Main{
    public static void main(String args[]) {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        String a = "";
        while (true){
            a = sc.nextLine();
            if(a.charAt(0) == '#') break;
            member(a);
        }
    }
    public static void member(String a) {
        String result = "";
        String[] member = a.split(" ");
        if(Integer.parseInt(member[1]) > 17 || Integer.parseInt(member[2]) >= 80){
            result = member[0] + " Senior";
        }else{
            result = member[0] + " Junior";
        }
        System.out.println(result);
    }
}