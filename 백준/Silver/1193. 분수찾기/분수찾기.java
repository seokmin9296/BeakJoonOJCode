import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(
        bunsu(Integer.parseInt(s)));
    }
    public static String bunsu(int a){
        boolean incBunja = false;
        boolean incBunmo = true;
        int cnt = 1;
        int bunja = 1;
        int bunmo = 1;

        while (a > cnt){
            if(incBunmo){
                if(bunja == 1){
                    incBunja = true;
                    incBunmo = false;
                    cnt++;
                    bunmo++;
                }else{
                    cnt++;
                    bunmo++;
                    bunja--;
                }
            }else if(incBunja){
                if(bunmo == 1){
                    incBunja = false;
                    incBunmo = true;
                    cnt++;
                    bunja++;
                }else{
                    cnt++;
                    bunja++;
                    bunmo--;
                }
            }
        }

        String result = bunja + "/" + bunmo;
        return result;
    }
}