package practice1.ASAClev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3053 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double R = Double.parseDouble(br.readLine());

        /*
            택시 기하학 대각선이 길이가 2R
         */

        System.out.println(R*R*Math.PI);
        System.out.println(2*R*R);
    }
}
