import java.io.*;
import java.util.*;

class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] check;
    static int N, M, V;

    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 정점의 개수
        M = Integer.parseInt(st.nextToken());// 간선의 개수
        V = Integer.parseInt(st.nextToken());// 정점의 번호

        // 그래프 생성후 list배열 만들어 주기
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);// 양방향리스트
        }

        // 작은것부터 하라했으니 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // DFS먼저
        check = new boolean[N + 1];
        dfs(V);
        System.out.println();

        // bfs
        check = new boolean[N + 1];
        bfs(V);
        System.out.println();

    }

    static void dfs(int node) {
        check[node] = true;// 체크
        System.out.print(node + " ");

        for (int next : graph[node]) {
            if (!check[next])
                dfs(next);// 재귀 호출로
        }
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        check[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int cur = q.poll();
            System.out.print(cur + " ");

            for (int next : graph[cur]) {
                if (!check[next]) {
                    check[next] = true;
                    q.add(next);
                }
            }

        }
    }
}