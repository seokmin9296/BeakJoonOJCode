import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static class Paper{
        int x;
        int y;
        Paper(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Paper> papers = new ArrayList<>();
        for(int i = 0; i < n ; i ++){
            String s = br.readLine();
            String[] nums = s.split(" ");
            int left = Integer.parseInt(nums[0]);
            int btm = Integer.parseInt(nums[1]);
            Paper p = new Paper(left, btm);
            papers.add(p);
        }
        findArea(papers);
    }
    public static void findArea(List<Paper> papers){
        boolean[][] plate = new boolean[100][100];
        for(int i = 0 ; i < 100 ; i ++){
            for(int j = 0 ; j < 100 ; j ++){
                plate[i][j] = false;
            }
        } // plate 초기화
        for(int i = 0 ; i < papers.size() ; i ++){
            int left = papers.get(i).x;
            int btm = papers.get(i).y;
            for(int x = left ; x < left+10 ; x ++){
                for(int y = btm ; y < btm+10 ; y ++){
                    plate[x][y] = true;
                }
            } // 겹치는 부분 판정
        }
        int total = 0;
        for(int i = 0 ; i < 100 ; i ++){
            for(int j = 0 ; j < 100 ; j ++){
                if(plate[i][j]){
                    total ++;
                }
            }
        }
        System.out.println(total);
    }
}