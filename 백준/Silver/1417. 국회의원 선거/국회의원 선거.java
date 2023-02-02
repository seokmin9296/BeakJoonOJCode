import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> hubo = new ArrayList<>();
        int jijija = 0;
        for(int i = 0 ; i < n ; i ++){
            jijija = sc.nextInt();
            hubo.add(jijija);
        }

        int result = 0;
        result = maeSu(hubo);
        System.out.println(result);

        sc.close();
    }
    public static int maeSu(List<Integer> n){
        int maesu = 0;
        int maxIndex = 0;
        int dasom = n.get(0);
        n.remove(0);
        if(n.size() == 0 || dasom > Collections.max(n)){
            return maesu;
        }
        while (true) {
            maxIndex = n.indexOf(Collections.max(n));
            n.set(maxIndex, Collections.max(n) - 1);
            dasom++;
            maesu++;
            if (Collections.max(n) < dasom) {
                break;
            }
        }
        return maesu;
    }
}