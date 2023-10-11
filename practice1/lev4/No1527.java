package practice1.lev4;

import java.util.*;
import java.io.*;

public class No1527 {
    static int count;
    static int A,B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        dfs(0);
        System.out.println(count);
    }

    public static void dfs(long num) {
        if (num>B) return;
         else if(num >= A && num <= B) count++;

        dfs(num*10+4);
        dfs(num*10+7);
    }
}
