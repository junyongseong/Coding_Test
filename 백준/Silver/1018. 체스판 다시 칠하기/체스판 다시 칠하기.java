import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        //이게뭐고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //보드판 만들기
        char[][] board = new char[N][M];//N M크기 만큼
        for(int i=0;i<N;i++){//세로 길이 만큼만 받으면 됨
            String str = br.readLine();
            for(int j =0;j<M;j++){
                board[i][j]=str.charAt(j);//보드판 채ㅇ기
            }
        }
        //8*8짜리 보드판 패턴 필요함 시작은 W or B시작
        char[][] startW =new char[8][8];//W로 시작하는경우와 B로 시작
        char[][] startB =new char[8][8];//판 크기는8*8로 고정되어있음

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if((i+j)%2==0){//짝수면 시작색이고 ex) 0,0 짝수 0,1 홀수 0,2짝수이런식
                    startW[i][j]='W';//W시작
                    startB[i][j]='B';//B시작
                }
                else{//홀수일때니 반대색
                    startW[i][j]='B';//반대로
                    startB[i][j]='W';
                }
            }
        }
        //이제 비교해야함
        int min = Integer.MAX_VALUE;//최소를  저장할 곳
        //이제  모두 검사준비
        for(int i=0;i<=N-8;i++){//시작 좌표는 지정한곳에서 -8한곳
            for(int j=0;j<=M-8;j++){//M좌표도 마찮가지
                int compareW=0;//w로 시작하는거 비교
                int compareB=0;//B로 시작하는거 비교

                // 보드판 비교해야함
                for(int a = 0; a < 8; a++){
                    for(int b = 0; b < 8; b++){

                        // 실제 보드의 색
                        char real = board[i + a][j + b];

                        // 패턴과 다르면 비교 수 증가
                        if(real != startW[a][b])//W로 시작했을때  올바른 색
                            compareW++;
                        if(real != startB[a][b])//B로 시작했을때 올바른색
                            compareB++;
                    }
                }
                // 두 개중 더 작은걸 선택
                int less = Math.min(compareW, compareB);

                //제일 작은값으로 최신화
                min = Math.min(min, less);
            }
        }
        System.out.println(min);
    }
}