package practice1.ASAClev3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No4619 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
            A를 1부터 대입해 가장 근접한 수를 찾으면 됨
         */
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            //[B의 근접한 A값을 저장할 변수]
            int A1 = 0;
            int A2 = 0;

            if (B==0 && N==0)  {
                break;
            }

            int A =0;

            while (true) {
                if (Math.pow(A, N) <= B) {
                    A1 = A;
                } else if (Math.pow(A,N) > B) {
                    A2 = A;
                    break;
                }
                A++;
            }

            if (Math.abs(Math.pow(A1, N)-B) <= Math.abs(Math.pow(A2, N)-B)) {
                System.out.println(A1);
            } else {
                System.out.println(A2);
            }
        }

    }
}
