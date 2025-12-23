import java.io.*;
import java.util.*;

class Main {
    static List<Integer>[] graph;//양방향이어야하니 hashMap대신
    static boolean[] visited;
    static int[] parent;
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        parent = new int[N+1];

         for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=1;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b  = Integer.parseInt(st.nextToken());
            graph[a].add(b);//a와 b연결
            graph[b].add(a);
        }
        dfs(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
    }
    static void dfs(int a){
        visited[a] = true;

        for(int next: graph[a]){//dfs로 반복
            if(!visited[next]){
                parent[next] =a;
                dfs(next);
            }

        }
    }
}