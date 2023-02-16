import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] result = new int[9][9];
        for(int i = 0 ; i < 9 ; i ++){
            String s = br.readLine();
            String[] nums = s.split(" ");
            for(int j = 0 ; j < 9 ; j ++){
                result[i][j] = Integer.parseInt(nums[j]);
            }
        }
        findMax(result);
    }
    public static void findMax(int[][] grid){
        int max = -1;
        int row = 0;
        int col = 0;
        for(int i = 0 ; i < 9 ; i ++){
            for(int j = 0 ; j < 9 ; j ++){
                if(grid[i][j] > max){
                    max = grid[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}