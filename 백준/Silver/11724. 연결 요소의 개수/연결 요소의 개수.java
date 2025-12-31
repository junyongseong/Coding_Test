import java.io.*;
import java.util.*;

class Main {
    static ArrayList<Integer>[] graph;// 그래프 표현할 list
    static int[] visited;// 방문 채크할 배열
    static StringBuilder sb;
    static int N, M;

    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());// 정점의 개수 N
        M = Integer.parseInt(st.nextToken());// 정점의 개수 M

        graph = new ArrayList[N + 1];// N+1크기만큼
        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        int count = 0;
        visited = new int[N+1];
        for (int i = 1; i <= N; i++) {
            if (visited[i] == 0) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    static void dfs(int x) {
    visited[x] = 1; // 방문 처리

    for (int next : graph[x]) {
        if (visited[next] == 0) {
            dfs(next);
        }
    }
}
}