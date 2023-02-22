package practice1.lev2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1436 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int num = 666;
        int cnt = 1;

        while(cnt != n) {
            num++;  //667..668..669....1666
            if(String.valueOf(num).contains("666")) {
                cnt++;
            }
        }

        System.out.println(num);

    }
}
