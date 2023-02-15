import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static class Rooms {
        int floor;
        int roomNo;
        Rooms(int floor, int roomNo){
            this.floor = floor;
            this.roomNo = roomNo;
        }
    }
    public static List<Rooms> list = new ArrayList<>();


    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i ++){
            int floor = Integer.parseInt(br.readLine());
            int ho = Integer.parseInt(br.readLine());
            list.add(new Rooms(floor, ho));
        }
        calculate(list);
    }

    public static void calculate(List<Rooms> roomList){
        for(int i = 0 ; i < roomList.size(); i ++){
            int floor = roomList.get(i).floor+1;
            int ho = roomList.get(i).roomNo;
            int[][] result = new int[floor][ho];
            result[0][0] = 1;
            for(int j = 1; j < floor ; j ++){
                result[j][0] = 1;
            }
            for(int j = 1; j < ho; j ++){
                result[0][j] = 1 + result[0][j-1];
            }

            for(int j = 1; j < floor; j ++){
                for(int k = 1; k < ho; k ++){
                    result[j][k] += result[j-1][k] + result[j][k-1];
                }
            }
            System.out.println(result[floor-1][ho-1]);
        }
    }
}