package practice1.lev4;

import java.io.*;
import java.util.*;
public class No2980 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int [][] arr = new int[N][3];

       for (int i = 0; i<N; i++) {
           st = new StringTokenizer(br.readLine());
           arr[i][0] = Integer.parseInt(st.nextToken());
           arr[i][1] = Integer.parseInt(st.nextToken());
           arr[i][2] = Integer.parseInt(st.nextToken());
       }

        int time = 0; // 이동 시간
        int l = 0; // 이동 거리
        int index = 0; // 신호등 정보 배열 접근 인덱스

        //이동 시간 구하기
        while(l < L) {
            //신호등을 모두 지났을 경우
            if (index == N) {
                time += L - l;
                break;
            }
            int D = arr[index][0];
            int R = arr[index][1];
            int G = arr[index][2];

            // 현재 거리에서 가장 가까운 신호등까지 멈추지 않고 간다.
            time += D - l;
            l = D;

            // 신호등 빨간불, 초록불 확인
            if (time % (R + G) < R) { //빨간불
                time += R - (time % (R+G));
            }
            // 다음 신호등으로 이동
            index++;
        }

        System.out.println(time);

       }
    }


