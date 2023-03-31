package practice1.lev4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No2178 {
    /*
    미로찾기 최단거리이므로 BFS사용
     */
    static int [][] map;
    static int n; //행
    static int m; //열
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0 };
    static int[] dy = {0,1,0,-1};

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});

        while (!q.isEmpty()) { //큐에 들어간 좌표 탐색이 모두 끝날 때까지 반복
            int[] xy = q.poll();

            for (int i=0; i<4; i++) {  //동,서,남,북 탐색
                int nextX = xy[0] +dx[i];
                int nextY = xy[1] +dy[i];

                //[다음 지점이 미로를 벗어나거나, 벽이거나, 이미 탐색한 곳이면 무시]
                if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m || visited[nextX][nextY]
                        || map[nextX][nextY] == 0) {
                    continue;
                }
                //[다음 탐색 지점을 큐에 추가]
                q.add(new int[] {nextX, nextY});
                //[다음 탐색 지점 탐색처리]
                visited[nextX][nextY] = true;
                //[다음 탐색 지점의 비용을 현재 좌표 +1로 변경]
                map[nextX][nextY] = map[xy[0]][xy[1]] + 1;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m]; // 미로 지도
        visited = new boolean[n][m]; //방분 여부
        visited[0][0] = true; //초기화

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j =0; j<m; j++) {
                map[i][j] = str.charAt(j)-'0';
            }
        }
        bfs(0,0);
        System.out.println(map[n-1][m-1]);
    }
}
