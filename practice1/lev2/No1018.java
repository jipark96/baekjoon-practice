//1018번 체스판 다시 칠하기
package practice1.lev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1018 {

    public static boolean[][] arr;
    public static int min=64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        arr = new boolean [n1][n2];

        for (int i=0; i< n1; i++) {
            String s = br.readLine();

            for(int j=0; j< n2; j++) {
                if(s.charAt(j)=='W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }
        int row = n1-7;
        int col = n2-7;

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                find(i,j);
            }
        }
        System.out.println(min);
    }
    public static void find(int x, int y) {
        int end_x = x+8;
        int end_y =y+8;
        int cnt =0;

        boolean check = arr[x][y];

        for (int i=x; i<end_x; i++) {
            for (int j=y; j<end_y; j++) {
                if (arr[i][j] != check) {
                    cnt++;
                }
                check = !check;
            }
            check = !check;
        }
        cnt = Math.min(cnt,64-cnt);
        min = Math.min(min,cnt);
    }
}
