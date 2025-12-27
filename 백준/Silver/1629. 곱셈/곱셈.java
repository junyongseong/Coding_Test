import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
    static int A,B,C;

    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());


        System.out.println(cal(A,B));
    }
    //그냥 계산하면 무조건 터져서 여기서 해줘야함
    //int로는 부족하니 long
    static long cal(long a, long b){
        if(b==0)
            return 1;//이유 3^0 , 5^0이것들은 무조건 1임 없으면 무한
        long half = cal(a,b/2);//지수를 절반으로 나눔 
        //ex ) 11이면 11->5->2->1->0이렇게 끝이남
        long res = (half * half)%C;

        //이건 b가 짝수일때만 가능함 그래서 만약 홀수라면
        //한번더 해야함 즉 b가 1 3 처럼 바로 2로 안나눠지는경우임
        if(b%2==1){
            res = (res *a)%C;
        }
        return res;
    }
}