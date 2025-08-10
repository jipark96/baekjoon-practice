package practice1.lev003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2577 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        /*
            숫자를 문자열로 변경 후 0~9 까지 조회
         */

        int[] count = new int[10];

        int num = A*B*C;
        String str = Integer.toString(num);

        for (int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);
            count[c - '0']++;
        }

        for (int i=0; i<10; i++) {
            System.out.println(count[i]);
        }
    }
}
