package practice1.ASAClev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
        단어 개수 구하기
        1. 공백으로 찾아보기
         */

        StringTokenizer st = new StringTokenizer(br.readLine() ," ");
        System.out.print(st.countTokens());

    }
}
