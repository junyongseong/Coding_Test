import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //2*N 크기 직사각형 타일
        //if n=1 2*1 (1개)
        // if n=2 2*2 = (1*2) 2개
        // if n=3 2*3 =6  방법 3개  4=5? 5=8? 6=13? 7=21? 8=34? 9=55
        //dp[1]=1,dp[2]=2 dp[n]= dp[n-1]+dp[n-2] 이거
        int[]dp = new int[1001];
        dp[1]=1;
        dp[2]=2;

        for(int i=3;i<=n;i++){
            dp[i]= (dp[i-1]+dp[i-2])%10007;
        }

        System.out.println(dp[n]);
    }
}