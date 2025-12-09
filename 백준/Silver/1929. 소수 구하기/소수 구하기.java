import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        boolean[] sosu=  new boolean[B+1];

        for(int i=0;i<sosu.length;i++){
            sosu[i]= true;//기본적으로 일단 true즉 소수
        }
        sosu[0]=false;
        sosu[1]=false;//0과 1은 소수 X

        //이제 2부터 체크  해줘야함 2 3 5 7 ...소수들
        for(int i=2;i<=Math.sqrt(B);i++){//B의 제곱근까지
            if(sosu[i]){//만약 소수면
                for(int j=i*i;j<=B;j+=i){
                    sosu[j]=false;
                }
            }
        }

        for(int i=A;i<=B;i++){
            if(sosu[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}