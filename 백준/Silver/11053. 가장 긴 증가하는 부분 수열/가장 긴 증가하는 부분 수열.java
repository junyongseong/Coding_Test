import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ar[] = new int[A];
        int dp[] = new int[A];
        for (int i = 0; i < A; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < A; i++) {
            // 0 ~ i까지 탐색함
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (ar[j] < ar[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        // 최대일때 찾기
        int res = -1;
        for (int i = 0; i < A; i++) {
            res = dp[i] > res ? dp[i] : res;//삼항
        }
        System.out.println(res);
    }
}