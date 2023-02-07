import java.io.IOException;


public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        int[] arr = new int[26];
        int c = System.in.read();
        int max = -1;
        int ch = 0;

        while (c > 64) {
            if(c < 91){
                arr[c - 65] ++;
            }else {
                arr[c - 97] ++;
            }
            c = System.in.read();
        }
        for( int i = 0 ; i < 26; i ++){
            if(arr[i] > max){
                max = arr[i];
                ch = i;
            } else if (arr[i] == max) {
                ch = -2;
            }
        }
        System.out.println((char) (ch+65));
    }
}