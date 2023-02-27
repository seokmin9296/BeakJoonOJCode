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

        int min = a[0]; // 최소값
        int max = a[0]; // 최대값

        for(int i = 1 ; i < a.length ; i ++){ // 배열 a의 최대값과 최소값 정의
            if(a[i] < min){
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }

        int range = max - min + 1; // 배열의 범위를 지정
        int[] cnt = new int[range];

        for(int i = 0 ; i < range ; i ++){
            cnt[i] = 0;
        }

        for(int i = 0 ; i < a.length ; i ++){
            cnt[a[i] - min]++;
        }


        for(int i = 1; i < range ; i ++){
            cnt[i] += cnt[i - 1];
        }

        int[] sorted = new int[a.length];
        for(int i = a.length - 1 ; i >= 0 ; i --){
            sorted[cnt[a[i] - min] - 1] = a[i];
            cnt[a[i] - min]--;
        }

        for(int i = 0 ; i < a.length ; i ++){
            a[i] = sorted[i];
        }
        return a;
    }
}