import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        scan();
    }

    // 입력을 받고 findCard 메서드를 호출하는 메서드
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력의 첫 번째 줄에서 최대 카드 수와 목표 값 추출
        String[] nums = br.readLine().split(" ");
        int targetValue = Integer.parseInt(nums[1]);

        // 입력의 두 번째 줄에서 카드 값 추출하여 int 배열로 변환
        int[] cards = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // findCard 메서드 호출하여 결과값 출력
        bw.write(String.valueOf(findCard(cards, targetValue)));
        bw.newLine();
        bw.flush();
        bw.close();
    }

    // 3개의 카드를 선택하여 그 합이 target에 가장 근접한 값을 찾아 반환하는 메서드
    public static int findCard(int[] cards, int m) {
        int answer = 0;
        int n = cards.length;

        // 카드의 합이 m을 넘지 않는 경우 중 가장 큰 값을 찾기 위해
        // 3개의 카드를 선택하여 합을 구하고, 그 중 최댓값을 찾습니다.
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = cards[i] + cards[j] + cards[k];

                    if (sum <= m) {
                        answer = Math.max(answer, sum);
                    }
                }
            }
        }

        return answer;
    }
}