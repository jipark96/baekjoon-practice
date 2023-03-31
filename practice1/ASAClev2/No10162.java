package practice1.ASAClev2;

import java.io.*;

public class No10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] times = {300,60,10};
        int[] result = new int[3];

        for (int i=0; i<3; i++) {
            result[i] += T / times[i];
            T = T % times[i];
        }
        if(T % 10 !=0) {
            System.out.print("-1");
        } else {
        for (int i = 0; i<3; i++) {
                System.out.print(result[i]+" ");
            }
        }
    }
}
