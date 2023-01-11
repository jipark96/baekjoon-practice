//1546 평균

package practice1.lev1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        double arr[] = new double[n];

        double sum=0;
        double max=0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());

            if(arr[i]>max) {
                max=arr[i];
            }
        }

        for(int i=0; i<n; i++) {
            sum+=arr[i]/max*100;
        }
        System.out.println(sum/n);
    }
}
