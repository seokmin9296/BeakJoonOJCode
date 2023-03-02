import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");

        int[] result = compress(nums);
        bw.write(Integer.toString(result[0]));
        for(int i = 1; i < result.length ; i ++){
            bw.write(" " + result[i]);
        }

        bw.flush();
        bw.close();
    }

    public static int[] compress(String[] nums){
        int n = nums.length;
        int[] sorted = Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(sorted); // 배열을 정렬함

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        // 각 값이 몇 번째로 작은 값인지 map에 저장함
        for( int i = 0 ; i < n ; i ++){
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i], index++);
            }
        }
        
        // 압축된 값을 다시 배열에 저장하고 리턴
        int[] compressed = new int [n];
        for(int i = 0 ; i < n ; i ++){
            compressed[i] = map.get(Integer.parseInt(nums[i]));
        }
        return compressed;
    }
}