//2675번 문자열 반복
package practice1.lev1;

import java.io.*;
import java.util.StringTokenizer;

public class BJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < num; k++) {
                    bw.write(s.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
