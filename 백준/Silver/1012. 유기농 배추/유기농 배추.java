import java.io.*;
import java.util.StringTokenizer;

class Main {
    static int[][] ar= new int[51][51];
    static boolean[][] check;//체크용 불린
    static int M,N,K;

    //상하 좌우 이동용 템플릿임 
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t =0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            M = Integer.parseInt(st.nextToken());//가로길이
            N = Integer.parseInt(st.nextToken());//세로길이
            K = Integer.parseInt(st.nextToken());//배추 심어져 있는 갯수
            ar =  new int[M][N];//새롭게 배열 만들기 
            check = new boolean[M][N];//체크용 불린

            for(int i =0; i<K;i++){
                StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
                int x = Integer.parseInt(st2.nextToken());
                int y = Integer.parseInt(st2.nextToken());
    
                ar[x][y]=1;
            }
            int count =0;
            for(int i=0;i<M;i++){
                for(int j=0;j<N;j++){
                    if(ar[i][j]==1&&!check[i][j]){//배추 존재 & 아직 체크 X시 해야하는곳
                        dfs(i, j);//dfs호출하고 
                        count++;//숫자ㅏ 증가 
                    }
                }
            }
            System.out.println(count);

        }
    }
    static void dfs(int x,int y){//재귀용
        check[x][y] = true;//호출 되었을땐 true

        for(int i=0;i<4;i++){//상하좌우 4방향을  봐야함 
            int nx= x+dx[i];
            int ny= y+dy[i];

            //배추가 아직 존재하면 dfs 계속 해야함
            if(nx>=0 && nx<M && ny>=0&&ny<N){//배추밭 안에 존재하는지
                if(ar[nx][ny]==1 && !check[nx][ny]){//배추가 존재 & 체크 X일때
                    dfs(nx, ny);//재귀함수 호출 방문 X니 계속 퍼져야함 
                }
            }
        }
    }
}