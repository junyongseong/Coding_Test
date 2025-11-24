import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        //n=1 1/ n=2 3/ n=3 5 / n=4 11
        //dp[1]=1 dp[2]= 3 dp[n]= dp[n-2]*2+dp[n-1]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];

        dp[1]=1;
        dp[2]=3;
        for(int i =3; i<=n;i++){
            dp[i]=(dp[i-2]*2 +dp[i-1])%10007;
        }
        System.out.println(dp[n]);
    }
}