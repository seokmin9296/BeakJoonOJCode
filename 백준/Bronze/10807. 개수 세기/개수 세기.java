import java.util.*;
public class Main{
    public static void main(String args[]) {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        String a = "";
        int n, m = 0;
        n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }
        m = sc.nextInt();
        find(m, array);
    }
    public static void find(int m, int[] array) {
        int result = 0;
        for(int i = 0; i < array.length ; i++){
            if(array[i] == m){
                result += 1;
            }
        }
        System.out.println(result);
    }
}