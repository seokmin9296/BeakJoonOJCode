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
        String[] strings = new String[n];

        for(int i = 0 ; i < n ; i ++){
            strings[i] = br.readLine();
        }
        String[] result = sortedString(strings);
        for(int i = 0 ; i < result.length ; i ++){
            bw.write(result[i]+"\n");
        }
        bw.flush();
        bw.close();
    }

    public static String[] sortedString(String[] s) {
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length()){
                    return Integer.compare(o1.length(), o2.length());
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

        Set<String> set = new LinkedHashSet<>(Arrays.asList(s)); // 중복되는 문자열 제거

        return set.toArray(new String[0]);
    }
}
