package practice1.lev003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] count = new int[10];
        String str = Integer.toString(N);

        /*
            1. 가장 많이 필요한 숫자 찾기
            2. 6,9 공유 가능하게 수정
         */

        for (int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);
            count[c - '0']++;
        }

        // 6,9 공유
        int shared = count[6] + count[9];
        count[6] = (shared + 1) / 2; //홀수면 올림
        count[9] = 0; // 6,9 공유하므로 9는 더 이상 사용 X

        int max = 0;
        for (int i = 0; i<10; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }
        System.out.println(max);
    }
}
