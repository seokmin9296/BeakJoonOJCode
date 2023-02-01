import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0 ; i < 10 ; i ++){
            int m = sc.nextInt();
            numberList.add(m%42);
        }
        for(int i = 0 ; i < numberList.size(); i ++){
            if(!result.contains(numberList.get(i))){
                result.add(numberList.get(i));
            }
        }
        System.out.println(result.size());
        sc.close();
    }
}