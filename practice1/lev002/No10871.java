package practice1.lev002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());


        /*
            StringTokenizer를 위에 한번만 쓰면 오류뜸
            for문 바로 직전에 한번 더 써줘야 함
         */

        st = new StringTokenizer(br.readLine());
        for (int i=0; i < A; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num < B) {
                System.out.print(num+" ");
            }

        }
    }
}
