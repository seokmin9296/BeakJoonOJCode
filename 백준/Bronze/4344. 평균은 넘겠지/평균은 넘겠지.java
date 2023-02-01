import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int score = 0;
        float students = 0;
        float cnt = 0;
        float average = 0;
        float total = 0;

        List<Integer> scores = new ArrayList<>();
        float result = 0;


        for(int i = 0 ; i < num ; i ++){
            students = sc.nextInt();
            score = 0;
            total = 0;
            for(int j = 0 ; j < students ; j ++){
                score = sc.nextInt();
                scores.add(score);
                total += score;
            }
            average = total / students;
            cnt = 0;
            for(int k = 0 ; k < scores.size() ; k ++){
                if(average < scores.get(k)){
                    cnt++;
                }
            }
            result = (float) (cnt / students) * 100;
            String resultS = String.format("%.3f", result);
            System.out.println(resultS + "%");
            scores.clear();
        }
        sc.close();
    }
}