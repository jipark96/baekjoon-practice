package practice1.ASAClev2;

import java.io.*;
import java.util.StringTokenizer;

public class No3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] e1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine()," ");
        int[] e2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine()," ");
        int[] e3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int x = 0;
        int y = 0;
        /*
            세 점을 이용해 직사각형을 만들기 위한 네 번째 점 찾기
            직사격형 특징 찾기
            축과 평행하기 때문에 세 점 중 다른 x축과 y축 구하기
         */
        if(e1[0]==e2[0]) {
            x = e3[0];
        } else if(e1[0]==e3[0]) {
            x = e2[0];
        } else {
            x = e1[0];
        }

        if(e1[1]==e2[1]) {
            y = e3[1];
        } else if(e1[1]==e3[1]) {
            y = e2[1];
        } else {
            y = e1[1];
        }
        System.out.println(x+" "+y);
    }
}

