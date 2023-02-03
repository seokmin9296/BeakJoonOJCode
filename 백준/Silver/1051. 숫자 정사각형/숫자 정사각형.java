import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int len = Math.min(n,m);
        int[][] map = new int[n][m];
        sc.nextLine();
        for(int i = 0 ; i < n ; i ++){
            String str = sc.nextLine();
            for(int j = 0 ; j < m ; j ++){
                map[i][j] = str.charAt(j) - '0';
            }
        }
        while (len > 1){
            for(int i = 0 ; i <= n-len ; i++){
                for(int j = 0 ; j <= m-len ; j ++){
                    int num = map[i][j];
                    if(num == map[i][j+len-1] && num == map[i+len-1][j] && num == map[i+len-1][j+len-1]){
                        System.out.println(len*len);
                        return;
                    }
                }
            }
            len--;
        }
        System.out.println(len*len);
    }
}