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
        byte[] cnt = new byte[range]; // range값을 기반으로 byte 배열 생성

        for(int i = 0 ; i < a.length ; i ++) {
            cnt[a[i] - min] ++;
        }// a의 요소의 발생 횟수 만큼 cnt 값의 갯수 증가. if a[i] = 5, min = 2 -> cnt[3] ++;

        int index = 0;
        for(int i = 0 ; i < range ; i++){
            for(int j = 0 ; j < cnt[i] ; j ++){ //cnt[i]의 값이 0일 경우 실행되지 않음.
                a[index++] = i + min; //cnt[i]의 값이 존재 할 경우 a[index]는 i+min, 이후 index 증가
            }
        }
        return a;
    }
}
