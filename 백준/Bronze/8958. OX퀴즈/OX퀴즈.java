import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        int score = 0;
        String testResult = "";
        List<String> testResults = new ArrayList<>();
        sc.nextLine();
        for(int i = 0 ; i < num ; i ++){
            testResult = sc.nextLine();
            testResults.add(testResult);
        }

        for(int i = 0 ; i < testResults.size() ; i ++){
            score = 0;
            cnt = 0;
            for(int j = 0 ; j < testResults.get(i).length() ; j ++){
                if(testResults.get(i).charAt(j) == 'O'){
                    cnt += 1;
                }else {
                    cnt = 0;
                }
                score += cnt;
            }
            System.out.println(score);
        }
        sc.close();
    }
}