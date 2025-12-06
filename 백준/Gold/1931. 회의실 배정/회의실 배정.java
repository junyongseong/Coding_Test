import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        //그리디 문제 종료 시간이 제일 빠른걸 찾아야지 최적 개수를 구함
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] 회의 = new int[N][2];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            회의[i][0] = Integer.parseInt(st.nextToken());
            회의[i][1] = Integer.parseInt(st.nextToken());
        }//여기까지 입력 받음 쉽고
        //이제 정렬해야함 무슨  순으로?종료시간 기준으로
        //뭐로? 오름차순으로
        Arrays.sort(회의,(a,b)->{
            if(a[1]==b[1])//먼저 종료시간이 같을경우
            //왜  뺴냐 음수면 a가 더 빠른거 양수면 b가 더 빠른거 
                return a[0]-b[0];//회의 시작시간  작은거
            //이떈 종료시간이 같지 않으니 그냥 종료 시간  작은거
            return a[1]-b[1];
        });
        int 개수 =0;
        int 종료시간 =0;
        for(int i=0;i<N;i++){
            if(회의[i][0]>=종료시간){
                개수++;
                종료시간 = 회의[i][1];
            }
        }
        System.out.println(개수);
    }
}