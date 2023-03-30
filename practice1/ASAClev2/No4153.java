package practice1.ASAClev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
            세 변의 길이로 직각삼각형인지 구하기
            피타고라스 공식 이용
            while문을 이용하여 0 0 0 입력시 종료
         */

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0 && C == 0) break;

            if ((A * A + B * B) == C * C) {
                System.out.println("right");
            } else if ((A * A + C * C) == B * B) {
                System.out.println("right");
            } else if ((B * B + C * C) == A * A) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
