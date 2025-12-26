import java.io.*;
import java.util.*;

class Main {
    static int A,B,count;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        sb = new StringBuilder();
        cal();
        System.out.println(sb);
    }
    static void cal(){
        count = 1;
        while (B>A) {
            if (B % 2 == 0) {
                B /= 2;
                //case 2 B가 홀수인데 끝자리가 -1일때
                //B= (임의의수 *10)+1 임
            } else if (B % 10 == 1) {
                B = (B - 1) / 10;
            } else {
                sb.append(-1);
                return;
            }
            count++;
        }
        if(A==B)
            sb.append(count);
        else
            sb.append(-1);
    }
}