package practice1.ASAClev3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No5618 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);

        for(int i=1; i<=arr[0]; i++) {
            int count = 0;

            // 주어진 자연수의 공약수 찾기
            for(int j=0; j<n; j++) {
                if(arr[j] % i == 0)
                    count ++;
            }

            // 자연수 n개가 모두 i로 나누어떨어질때
            if(count == n)
                System.out.println(i);
        }
    }
}