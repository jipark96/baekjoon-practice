package practice1.ASAClev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
        1. c=, c-, dz=, d-, lj, nj, s=, z= 를 한단어로 취급하게 함
         */
        String S = br.readLine();
        String [] str = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for (int i=0; i<str.length; i++) {
            if(S.contains(str[i])) {
                S = S.replace(str[i],"1"); // 1로 바꿔주고 길이를 센다.
            }
        }
        System.out.println(S.length());
    }

}
