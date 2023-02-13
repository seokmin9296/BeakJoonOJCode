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
        String[] results = new String[n];
        for(int i = 0 ; i < n ; i ++){
            String s = br.readLine();
            String[] nums = s.split(" ");
            String result = hotel(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]), Integer.parseInt(nums[2]));
            results[i] = result;
        }
        for(int i = 0 ; i < n ; i ++){
            System.out.println(results[i]);
        }
    }
    public static String hotel(int a, int b, int c){
        String result = "";
        int floor = c % a;
        int roomNo = 0;
        if(floor == 0){
            floor = a;
            roomNo = (int)Math.ceil((double)(c / a));
        }else{
            roomNo = (int)Math.ceil((double)(c / a)) + 1;
        }
        String room = "";
        if(roomNo < 10){
            room = "0" + roomNo;
        }else {
            room = "" + roomNo;
        }
        result = floor+room;
        return result;
    }
}