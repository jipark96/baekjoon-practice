package practice1.lev4;

import java.io.*;
import java.util.*;
public class No1021 {

    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedList<Integer> deque = new LinkedList<Integer>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] seq = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i < M; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        for (int i = 0; i < M; i++) {

            int half;
            int target = deque.indexOf(seq[i]);

            if (deque.size() % 2 == 0) {
                half = deque.size() / 2 - 1;
            } else {
                half = deque.size() / 2;
            }

            // 중간 지점 보다 앞에 있을 경우
            if (target <= half) {
                for (int j = 0; j < target; j++) {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            } else {
                for (int j = 0; j< deque.size() - target; j++) {
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }

            deque.pollFirst(); // 연산이 끝나면 맨 앞 원소 삭제
        }
        System.out.println(count);
    }
}
