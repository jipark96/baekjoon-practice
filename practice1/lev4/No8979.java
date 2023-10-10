package practice1.lev4;

import java.io.*;
import java.util.*;
public class No8979 {
    static int num;
    static int gold;
    static int silver;
    static int bronze;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int [][] arr = new int[N+1][3];
        int rank = 1;

        for (int i = 1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());
            gold = Integer.parseInt(st.nextToken());
            silver = Integer.parseInt(st.nextToken());
            bronze = Integer.parseInt(st.nextToken());
            arr[num][0] = gold;
            arr[num][1] = silver;
            arr[num][2] = bronze;
        }
        for (int i=1; i<=N; i++) {
            if (arr[i][0] > arr[K][0]) {
                rank++;
            } else if (arr[i][0] == arr[K][0] && arr[i][1] > arr[K][1]) {
                rank++;
            } else if (arr[i][0] == arr[K][0] && arr[i][1] == arr[K][1] && arr[i][2] > arr[K][2]) {
                rank++;
            }
        }
        System.out.println(rank);

    }
}
