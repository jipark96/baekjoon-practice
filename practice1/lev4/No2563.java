package practice1.lev4;

import java.io.*;
import java.util.*;
public class No2563 {
    static int count;
    static int [][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        arr = new int[100][100];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j<x+10; j++) {
                for (int k =y; k<y+10; k++) {
                    arr[j][k]=1;
                }
            }
        }
        for (int i=0; i<100; i++) {
            for (int j = 0; j<100; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
