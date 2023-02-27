import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] nums = new int[num];
        for(int i = 0 ; i < num ; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }
        int[] sortedArr = countingSort(nums);
        for(int i = 0 ; i < sortedArr.length ; i++){
            bw.write(sortedArr[i]+"\n");
        }
        bw.flush();
        bw.close();
    }

    public static int[] countingSort(int[] a) {
        if (a.length == 0){
            return null;
        }

        int min = a[0];
        int max = a[0];

        for(int i = 1 ; i < a.length ; i ++){
            if(a[i] < min){
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }

        int range = max - min + 1;
        byte[] cnt = new byte[range];

        for(int i = 0 ; i < a.length ; i ++) {
            cnt[a[i] - min] ++;
        }
        int index = 0;
        for(int i = 0 ; i < range ; i++){
            for(int j = 0 ; j < cnt[i] ; j ++){
                a[index++] = i + min;
            }
        }
        return a;
    }
}