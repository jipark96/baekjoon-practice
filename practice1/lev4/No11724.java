package practice1.lev4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11724 {

    /*/
    DFS 사용
    무방향 그래프
     */
    static int[][] adj; // 간선 연결 상태
    static boolean[] visit; // 확인 여부
    static int N; //정점 개수
    static int M; //간선 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken()); //정점의 개수
        M = Integer.parseInt(st.nextToken()); //간선의 개수

        adj = new int[N+1][N+1]; //좌표를 그대로 받아들이기 위해 +1해서 선언
        visit = new boolean[N+1]; // 초기값 False

        //[간선 연결상태 입력 후 저장]
        for (int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            adj[u][v] = adj[v][u] =1;
        }
        int cnt = 0; //연결요소 개수

        //[0이라는 점은 없으므로 1부터 출발, 방문하지 않은 정점이 있으면 탐색하고 연결요소 개수 1추가)
        for (int j=1; j<=N; j++) {
            if(!visit[j]) {
                dfs(j);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    //[시작점을 변수로 받아 출발, 출력 후 다음 연결점 찾아 시작점을 변경하여 재호출]
    public static void dfs(int start) {
        visit[start] = true; // 방문
        //[방문 배열 처음부터 들면서 간선이 연결되어 있고, 방문을 하지 않으면 dfs 탐색한다.]
        for (int i =1; i<=N; i++) {
            if(adj[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }
}
