import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0 ;
        for(int i = 0 ; i < n ; i ++){
            String s = br.readLine();
            if(check(s)){
            cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean check(String s){
        boolean[] chk = new boolean[26];
        int prev = 0;
        for( int i = 0 ; i < s.length() ; i ++){
            int now = s.charAt(i);
            if(prev != now){
                if(chk[now - 'a'] == false){
                    chk[now - 'a'] = true;
                    prev = now;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}