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
            if(a.equals("#")) break;
            moem(a);
        }
    }
    public static void moem(String a) {
        String lower = "";
        int result = 0;

        for(int i = 0; i < a.length() ; i++){
            lower = a.substring(i, i+1).toLowerCase();
            if(lower.equals("a") || lower.equals("e") || lower.equals("i") || lower.equals("o") || lower.equals("u")){
                result += 1;
            }
        }
        System.out.println(result);
    }
}