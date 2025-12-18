import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static int N,M;
    static int[] selected,arr;
    static StringBuilder sb;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());

        selected = new int[M];//선택 된걸 넣어둘  배열?
        visited = new boolean[N];//선택 된걸 넣어둘  배열?
        arr = new int[N];
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        dfs(0);//깊이가 0
        System.out.println(sb);
    }
    static void dfs(int dd) {
    if (dd == M) {//깊이 0 부터 시작해서 M 까지
        for (int i = 0; i < M; i++) {
            sb.append(selected[i]).append(" ");
        }
        sb.append("\n");
        return;
    }

    for (int i = 0; i < N; i++) {
        if (visited[i])
            continue;

        visited[i] = true;
        selected[dd] = arr[i];
        dfs(dd + 1);
        visited[i] = false;//이부분이 중요
    }
}
}