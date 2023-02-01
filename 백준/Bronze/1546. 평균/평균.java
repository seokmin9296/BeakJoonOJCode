import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
		public static void main(String[] args) throws Exception {
		
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int n = Integer.parseInt(br.readLine());
				StringTokenizer st = new StringTokenizer(br.readLine());
				int[] arr = new int[n];
				double sum = 0;				
				int  M = 0;
				
				for (int i = 0; i < n; i++) {
						int score = Integer.parseInt(st.nextToken());
						arr[i] = score;
						if (score > M) {
								M = score;
						}
				}
				for (int i = 0; i < n; i++) {
						sum += ((double) arr[i] / M) * 100; // new score
				}
				System.out.println(sum / n);
		}
}