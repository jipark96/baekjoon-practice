package practice1.lev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1654 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        long max = 0;

        for(int i=0; i<k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }


        max++; // [upper bound 형식 max에서 +1 값이어야 함]
        long min = 0;
        long mid = 0;

        while (min < max) {
            mid = (max+min) / 2;

            int cnt = 0;

            // [구해진 중간 길이로 잘라서 총 몇개가 만들어지는 구함]
            for (int i = 0; i<arr.length; i++) {
                cnt += (arr[i] / mid);
            }

            /*
            [upper bound 형식]
            mid 길이로 잘랐을 때 개수가 만들고자 하는 랜선의 개수보다 작다면
            자로고자 하는 길이를 줄이기 위해 최대 길이를 줄임
            그 외에는 길이를 늘려야 하므로 최소 길이를 늘림
             */

            if(cnt < n) {
                max = mid;
            }
            else {
                min = mid+1;
            }
        }


        System.out.println(min -1);
    }
}
