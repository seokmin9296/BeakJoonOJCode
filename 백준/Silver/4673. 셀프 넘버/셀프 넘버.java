import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        List<Integer> compare = new ArrayList<>();

        for(int i = 1 ; i < 10000 ; i++){
            result.add(selfNumber(i));
            compare.add(i);
        }
        for(int i = 0 ; i < result.size() ; i++){
            if(compare.contains(result.get(i))){
                compare.remove(result.get(i));
            }
        }
        for( int i  = 0 ; i < compare.size() ; i++){
            System.out.println(compare.get(i));
        }

        sc.close();
    }
    public static int selfNumber(int n){

        int number = 0;

        if(n < 10){
            number = n+n;
        }else if(n >= 10 && n < 100){
            number = n + (n/10) + (n%10);
        }else if(n >= 100 && n < 1000){
            number = n + (n/100) + (n/10)%10 + (n%10);
        }else if(n >= 1000 && n < 10000){
            number = n + (n/1000) + (n/100)%10 + (n/10)%10 + (n%10);
        }
        return number;
    }
}