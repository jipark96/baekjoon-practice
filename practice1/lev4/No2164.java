package practice1.lev4;

import java.util.*;
public class No2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            myQueue.add(i);
        }
        while(myQueue.size()>1) {
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }
        System.out.println(myQueue.poll());
    }
}