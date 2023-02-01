import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double max = 0;
        double sumFakeScore = 0;
        List<Double> scoreList = new ArrayList<>();
        for(int i = 0 ; i < num ; i ++){
            double score = sc.nextDouble();
            scoreList.add(score);
        }
        for(int i = 0 ; i < scoreList.size(); i ++){
            if(max < scoreList.get(i)){
                max = scoreList.get(i);
            }
        }
        for(double fakeScore : scoreList){
            fakeScore = fakeScore/max*100;
            sumFakeScore += fakeScore;
        }
        double result = sumFakeScore/num;
        System.out.println(result);
        sc.close();
    }
}