import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        int[] sortedArr = statistic(nums);
        for(int i = 0 ; i < sortedArr.length ; i++){
            bw.write(sortedArr[i]+"\n");
        }
        bw.flush();
        bw.close();
    }

    public static int[] statistic(int[] a) {
        int[] result = new int[4];
        int average = (int) Math.round(Arrays.stream(a).average().orElse(Double.NaN));
        result[0] = average;

        int center = (int)Math.round((double) a.length/2);
        int[] sorted = Arrays.stream(a).sorted().toArray();
        result[1] = sorted[center-1];

        result[2] = findMode(a);

        int max = Arrays.stream(a).max().getAsInt();
        int min = Arrays.stream(a).min().getAsInt();

        result[3] = max - min;

        return result;
    }

    public static int findMode(int[] a){
        IntStream stream = Arrays.stream(a);

        // 각 요소를 key로 하고, 출현 횟수를 value로 하는 Map 객체
        Map<Integer, Long> map = stream.boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        // map 객체로부터 최빈값 찾기
        Optional<Map.Entry<Integer, Long>> mode = map.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        // 최빈값이 여러 개인 경우 두 번째로 작은 수 찾기
        List<Integer> modes = map.entrySet().stream()
                .filter(entry->entry.getValue().equals(mode.get().getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        if(modes.size() == 1){
            return modes.get(0);
        }else {
            modes.sort(Comparator.naturalOrder());
            return modes.get(1);
        }
    }
}
