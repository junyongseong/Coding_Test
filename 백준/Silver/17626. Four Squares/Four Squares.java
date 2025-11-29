import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];// dp문제?
        dp[0] = 0;
        dp[1] = 1;
        // dp[2]=2; dp[1]+1
        // dp[3]=3; dp[2]+1
        // dp[4]=1;
        // dp[5]=2; dp[2*2]+1
        // dp[6]=3; dp[5]+1
        // dp[7]=4; dp[6]+1 or dp[2*2] + dp[3]+1
        // dp[8]=2; dp[2*2]+dp[3]+1
        // dp[9]=1;
        // 점화식 : dp[i]= dp[i-j*j]
        int Min=0;
        for (int i = 2; i <= N; i++) {
            Min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                Min = Math.min(Min, dp[i - j * j]);
            }
            dp[i] = Min + 1;

        }
        System.out.println(dp[N]);
    }

}