import java.io.*;
import java.util.*;

class Main {
    static int N, M;
    static int[] ar, selected;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        // 먼저 ar 배열에 담기
        ar = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        selected = new int[M];
        Arrays.sort(ar);//
        sb = new StringBuilder();
        // dfs?
        dfs(0, 0);
        System.out.println(sb);
    }

    // 시작점 필요 0 0 부터 시작
    // 15663번과 다른점은 이문제는 재사용 허용
    static void dfs(int dept, int start) {
        // 종료 조건임
        if (dept == M) {
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        int prev = -1;
        for (int i = start; i < N; i++) {
            if (prev == ar[i])
                continue;
            selected[dept] = ar[i];
            prev = ar[i];

            dfs(dept + 1, i);//자기 자신 다시 사용 가능 즉 i임 i+1이면 다시 사용 X
        }

    }
}