import java.io.*;
import java.util.*;

class Main {
    static int N,M;
    static int[] ar,selected;
    static boolean[] visited;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        selected = new int[M];
        visited = new boolean[N];
        sb= new StringBuilder();

        ar= new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++){
            ar[i] = Integer.parseInt(st.nextToken());//배열 채우기까지 성공
        }
        Arrays.sort(ar);
        dfs(0);
        System.out.println(sb);
    }
    static void dfs(int dd){
        if(dd==M){//길이가 M이면
            for(int i=0;i<M;i++){
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        int pre =-1;//이전에 사용한 값
        for(int i =0;i<N;i++){
            if(visited[i])//참이면
                continue;
            if(pre==ar[i])//같은 값이면
                continue;

            //그 외일때
            visited[i] = true; //방문 표시
            selected[dd]=ar[i];
            pre = ar[i];
            dfs(dd+1);
            visited[i]=false;
        }
    }
}