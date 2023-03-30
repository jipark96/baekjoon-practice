package practice1.ASAClev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10250 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());
    int X = 0;
    int Y = 0;
    int YXX = 0;

        /*
            1호부터 위로 올라감 (101,201,301,.... 102,202...)
            (1,1)(2,1) ....
            N % H 는 층수가 나온다. but N % H = 0일때는 H이다.
            (N / H) + 1 은 호수, N % H = 0 일때는 N / H
         */
     for(int i =0; i<T; i++) {
         StringTokenizer st = new StringTokenizer(br.readLine()," ");
         int H = Integer.parseInt(st.nextToken());
         int W = Integer.parseInt(st.nextToken());
         int N = Integer.parseInt(st.nextToken());

         if (N % H == 0) {
             X = H * 100;
             Y = N / H;
         } else {
             X = N % H * 100;
             Y = (N / H) + 1;
         }
         YXX = X + Y;
         System.out.println(YXX);
     }
    }
}
