package practice1.ASAClev1;

import java.io.*;
import java.util.StringTokenizer;

public class No2557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        /*
            StringBuilder로 문자열 넣어놓기
            2N-1번째 줄까지 별 출력
            N번에 *이 2N개
            N번째 줄까지 만들고 밑에는 N번째 줄 빼고 반대로 해주기
         */

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N-i; j++) {
                sb.append(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i = N-1; i >=1; i--) {
            for(int j =1; j <= N-i; j++) {
                sb.append(" ");
            }
            for(int k=1; k<=2*i-1; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

