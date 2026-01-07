import java.io.*;
import java.util.StringTokenizer;

class Main {
    static int[][] dp = new int[30][30];//최대
    public static void main(String[] args) throws IOException {
        // 코드 작성
        //동쪽M개중에서 서쪽 N개를 고르는 문제 조합문제임 combina
        //dp문제 cal(n,m) = c(n-1,m-1)+c(n-1,m) 다리가 오른쪽 기준임
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(cal(M,N)).append("\n");
        }
        System.out.println(sb);
    }
    static int cal(int n,int m){

        //dp문제 첫번째 풀린경우 바로 반환
        if(dp[n][m]>0)
            return dp[n][m];

        if(n==m ||m==0)
            return dp[n][m]=1;

        return dp[n][m] = cal(n-1, m-1)+cal(n-1, m);
    }
}