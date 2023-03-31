package practice1.ASAClev2;

import java.io.*;
import java.util.StringTokenizer;

public class No2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        /*
        1. S를 한글자씩 빼서 R만큼 반복
         */

        for (int i =0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for (int j=0; j<S.length(); j++) {
                for (int k =0; k<R; k++){
                    bw.write(S.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
