import java.io.*;
import java.util.*;

class Main {
    static List<int[]> list;
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());//테스트 케이스 ok
        
        list = new ArrayList<>();//배열쓰고 동적으로 하니 어레이리스트 ok

        for(int i=0; i<N; i++){//테스트케이스 수 만큼 ok
            StringTokenizer st = new StringTokenizer(br.readLine());//분리해야하니 ok
            int size = st.countTokens();//리스트안 배열에 몇개 들어갈지 최적화 하기 위해서 ok

            int[] ar = new int[size];
            for(int j=0;j<size;j++){
                ar[j] = Integer.parseInt(st.nextToken());
            }
            list.add(ar);
        }

        //dp문제?
        //왼쪽위랑 바로 위 i-1,j-1//i-1,j
        //dp[i][j] = max(dp[i-1][j-1],dp[i-1][j])+ex[i][j];
        int[][] dp = new int[N][N];
        //맨첨
        dp[0][0] = list.get(0)[0];
        for(int i=1;i<N; i++){
            for(int j =0; j<list.get(i).length;j++){
                //먼저 맨 왼쪽
                if(j==0){
                    dp[i][j]=dp[i-1][j]+list.get(i)[j];
                }//맨 오른쪽
                else if(j== list.get(i).length-1){
                    dp[i][j] =dp[i-1][j-1]+list.get(i)[j];
                }//그외는 중간
                else
                    dp[i][j] = Math.max(dp[i-1][j-1],dp[i-1][j])+list.get(i)[j];
            }
        }
        int res =0;
        for(int x :dp[N-1]){
            res = Math.max(res, x);
        }
        System.out.println(res);
    }
}