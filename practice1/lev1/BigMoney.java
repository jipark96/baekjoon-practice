//1271번 엄청난 부자2
package practice1.lev1;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BigMoney {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}

