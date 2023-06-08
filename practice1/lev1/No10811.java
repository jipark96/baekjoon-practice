package practice1.lev1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] arr = new int[N+1];

        for (int i = 1; i<=N; i++) {
            arr[i]=i;
        }
        for (int n=0; n<M; n++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // [앞 뒤로 바꿔줌]
            while (i < j) {
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }

        for (int i =1; i<=N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
