import java.io.*;
import java.util.*;

class Main {
    static int N,M;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());//N까지
        M = Integer.parseInt(st.nextToken());//길이

        selected = new int[M];//선택된걸 넣어놀 배열
        dfs(1,0);
        System.out.println(sb);
    }
    static void dfs(int a,int dd){
        if(dd==M){//이떄는 배열이 전부 찼을떄임
            for(int i=0;i<M; i++){
            sb.append(selected[i]).append(" ");
            }
            sb.append('\n');//줄바꿈 해야지;;
            return;
        }
        for(int i=a;i<=N;i++){
            selected[dd]= i;//dd번째에i 넣기
            dfs(i,dd+1);//그다음거 재귀 함수 호출
        }
    }
}