import java.io.*;
import java.util.StringTokenizer;

class Main {
    static int N,r,c=0;
    public static void main(String[] args) throws IOException {
        // 코드 작성
        //z모양 왼쩍 위 ->오른쪽 위-> 왼쪽아래-> 오른쪽아래
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
         N = Integer.parseInt(st.nextToken());
         r = Integer.parseInt(st.nextToken());
         c = Integer.parseInt(st.nextToken());
        
         //2^N * 2^N 사이즈의 정사각형
         //ex) N=3 8*8
         //ex) N=4 16 * 16 이걸 4개로 쪼개기 즉 4개의사분면 생김
        int size= (int)Math.pow(2, N);
        int result=0;//결과

        //사이즈가 1이될때까지 반복해야함(2*2->1*1)이런식으로 줄어듬
        while(size>1){
        
            //사이즈는 한단계  내려가면 반으로 내려감 ex)8->4->2->1
            size /=2;
            //여기서 size는 사분면 한변의 길이임
            //먼저 0사분면r<size && c<size / 1사분면 r<size && cc>=size
            //2사분면 r>=size && c<size 3사분면 r>=size &&c>=size

            int quarter=0;//몇사분면인지 체크
            if(r<size && c<size)
                quarter=0;
            else if(r<size && c>=size)
                quarter=1;
            else if(r>=size && c<size)
                quarter=2;
            else
                quarter=3;

            //이제 결과 찾기
            //만약 N이  3이면 8*8짜리 크기 정사각형이고
            //size =8/2=4임 즉 각 사분면의크기는 4*4=16칸
            //여기에서 사분면을 곱해줘야함 재귀니 이런식으로식이 세워지고
            //이제 누적 방문 횟수니 이것들을 전부  더해준다.
            result += quarter*size*size;
            
            // System.out.println(result);
            //현재는  전체  공간 기준으로 하고 있음
            //이제 찾은 사분면의  기준으로 해야함

            //
            if(quarter==1){
                c-=size;
            }
            else if(quarter==2)
                r -=size;
            else if(quarter==3){
                r-=size;
                c-=size;
            }
        }
        System.out.println(result);
    }
}