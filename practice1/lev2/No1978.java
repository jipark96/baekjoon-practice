package practice1.lev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            boolean prime = true;

            if(num==1) {
                continue;
            }

            for (int j=2; j<num; j++) {
                if (num%j==0) {
                    prime=false;
                }
            }
            if(prime) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
