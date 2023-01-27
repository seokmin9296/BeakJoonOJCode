import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder star = new StringBuilder("");
        for(int i = 0; i < a ; i++){
            star.append("*");
            System.out.println(star.toString());
        }
    }
}