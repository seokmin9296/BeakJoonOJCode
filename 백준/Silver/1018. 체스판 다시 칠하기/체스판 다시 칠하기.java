import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        scan();
    }

    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = br.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);

        char[][] board = new char[n][m];

        for(int i = 0 ; i < n ; i ++){
            String line = br.readLine();
            for(int j = 0 ; j < m ; j ++){
                board[i][j] = line.charAt(j);
            }
        }


        int minRepaint = Integer.MAX_VALUE;

        for(int i = 0 ; i <= n - 8; i ++){
            for(int j = 0 ; j <= m - 8 ; j ++){
                int repaintWhite = 0;
                int repaintBlack = 0;

                for(int k = i ; k < i + 8 ; k ++){
                    for(int l = j ; l < j + 8 ; l ++){
                        if((k + l) % 2 == 0){
                            if(board[k][l] == 'B'){
                                repaintWhite++;
                            }
                        }else {
                            if(board[k][l] == 'W'){
                                repaintWhite++;
                            }
                        }
                    }
                }

                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if ((k + l) % 2 == 0) {
                            if (board[k][l] == 'W') {
                                repaintBlack++;
                            }
                        } else {
                            if (board[k][l] == 'B') {
                                repaintBlack++;
                            }
                        }
                    }
                }
                int repaint = Math.min(repaintWhite, repaintBlack);
                minRepaint = Math.min(minRepaint, repaint);
            }
        }


        bw.write(String.valueOf(minRepaint));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}