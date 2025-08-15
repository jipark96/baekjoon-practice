package practice1.lev003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // [성별][학년] 2차원 배열
        int [][] students = new int[2][7];

        for (int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            students[gender][grade]++;
        }

        int roomCount = 0;

        for (int gender = 0; gender<=1; gender++) {
            for (int grade = 1; grade <= 6; grade++) {
                int count = students[gender][grade];
                if (count > 0) {
                    roomCount += (count + K - 1) / K; //올림 처리
                }
            }
        }
        System.out.println(roomCount);
    }
}
