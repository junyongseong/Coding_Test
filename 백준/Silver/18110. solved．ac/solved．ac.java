import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  N = Integer.parseInt(br.readLine());
        int[] ar = new int[N];
        for(int i=0; i<N; i++){
            ar[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(ar);
        int fit=(int)Math.round(N*0.15);

        double result=0;
        for(int i=fit;i<N-fit;i++){
            result +=ar[i];
        }
        System.out.println((int)Math.round(result/(N-fit*2)));
    }
}