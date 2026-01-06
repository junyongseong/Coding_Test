import java.io.*;
import java.util.*;

class Main {
    static int N, K;
    static int[] visited = new int[100001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        Arrays.fill(visited, -1); // -1 :아직 방문 안한거

        //bfs위한 queue생성
        Queue<Integer> q = new LinkedList<>();
        //시작위치를 q에 넣음
        q.add(N);
        visited[N] = 0;

        //큐가 빌때까지
        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == K) {
                System.out.println(visited[cur]);
                return;
            }

            int[] next = {
                cur - 1,//한칸 뒤로
                cur + 1,//한칸 앞으로
                cur * 2};//이게 순간이동

            for (int nx : next) {
                if (nx < 0 || nx > 100000)
                    continue;
                if (visited[nx] != -1)
                    continue;

                visited[nx] = visited[cur] + 1;
                q.add(nx);
            }
        }
    }
}
