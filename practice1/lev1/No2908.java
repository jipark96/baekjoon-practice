//2908번 상수
package practice1.lev1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int n2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(n1>n2 ? n1:n2);
    }
}
