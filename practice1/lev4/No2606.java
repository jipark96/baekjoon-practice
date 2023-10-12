package practice1.lev4;

import java.io.*;
import java.util.*;

public class No2606 {
    static boolean [] visited; // 탐색 여부
    static ArrayList<Integer> [] A;
    static int v;
    static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 컴퓨터 수(정점)
        int m = Integer.parseInt(br.readLine()); // 연결된 컴퓨터 쌍의 수(간선)

        v = 1; // 탐색 시작할 정점의 번호
        A = new ArrayList[n+1];
        visited = new boolean[n+1];

        for (int i = 1; i<=n; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            A[u].add(v);
            A[v].add(u);
        }
        System.out.println(dfs(v));
    }

    public static int dfs(int v) {
        visited[v] = true; // 현재 노드를 방문했다는 정보를 visited 배열에 업데이트

        //현재 노드와 직접 연결된 모든 노드에 대해 탐색 시작
        for (int i : A[v]) {
            if (!visited[i]) {
                count++; // 카운트 증가(바이러스 감염 컴퓨터 수 증가)
                dfs(i); // 해당 노드로 이동하여 DFS 재귀적으로 계속
            }
        }
        return count;
    }

}
