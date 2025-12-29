import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//나무의 수 n
        int M = Integer.parseInt(st.nextToken());//내가 가져가려고 하는 나무의 길이 M

        int ar[] = new int[N];//나무 개수만큼 배열 생성
        st= new StringTokenizer(br.readLine());//나무 길이들
        int max= 0;//가장 길이가 큰 나무를 저장하기 위한 변수
        for(int i=0; i<N; i++){
            ar[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max,ar[i]);//가장길이가 큰 나무 저장
        }
        int mincutter =0;//절단기 최소
        int maxcutter = max;//절단기가 최대
        int res =0;//결과저장

        while (mincutter<=maxcutter) {//절단기 최대가 최소보다 클 때까지
            int mid =(mincutter+maxcutter)/2;
            long sum=0;//합이라 21억 넘어가니 long으로 총 얻은 나무길이

            for(int i=0;i<N;i++){
                if(ar[i]>mid)//sum계산 부분 나무가 중앙보다 크면 그만큼 나무를 가져감
                    sum+=ar[i]-mid;

                    
                }
                if(sum>=M){
                    res = mid;//만약 합이 M미터보다 높아지면 저장
                    mincutter =mid+1;//1m더 높은거 시도
                }else
                    maxcutter = mid-1;//1m더낮은거 시도함
        }
        System.out.println(res);

    }
}