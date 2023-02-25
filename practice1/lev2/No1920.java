package practice1.lev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i=0; i<arr1.length; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        //이진 탐색을 위해 오름차순 정렬
        Arrays.sort(arr1);

        int m =Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int j=0; j<m; j++) {
            int num = Integer.parseInt(st.nextToken());

            if(Arrays.binarySearch(arr1, num) >=0 ){
                sb.append(1).append("\n");
            }
            else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);

    }
}
