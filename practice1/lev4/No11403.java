package practice1.lev4;

import java.io.*;
import java.util.*;
public class No11403 {
    static int [][] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        A = new int[N][N];


        for (int i=0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (A[i][k] == 1 && A[k][j] ==1) {
                        A[i][j] = 1;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(A[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);



    }
}
