package practice1.lev003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class No3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0; i< arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = Integer.parseInt(br.readLine());

        // 중복 없이 숫자를 저장
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i<n; i++) {
            int target = sum - arr[i];

            if (set.contains(target)) {
                count++;
            }

            set.add(arr[i]);
        }
        System.out.println(count);

    }
}
