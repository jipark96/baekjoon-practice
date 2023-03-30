package practice1.ASAClev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /*
            O가 연속이면 연속된 값만큼 점수
            1. O의 값을 찾음
            2. O면 add+1
            3. O가 아니면 0으로 초기화
         */

        for (int i=0; i<N; i++) {
            String str = br.readLine();
            int add = 0;
            int score = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    add++;
                    score += add;
                } else {
                    add = 0;
                }
            }
            System.out.println(score);
        }
    }
}
