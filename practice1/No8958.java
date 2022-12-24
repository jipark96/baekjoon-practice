
package practice1;

import java.io.*;

public class No8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            String s = br.readLine();
            int cnt = 0;
            int sum = 0;
            int size = s.length();
            for(int j=0;j<size;j++) {
                if(s.charAt(j)=='O') {
                    cnt++;
                    sum += cnt;
                }else {
                    cnt = 0;
                }
            }
            System.out.println(sum);

        }
    }
}