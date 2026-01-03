import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine());

        int[][] ar= new int[N][N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                ar[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //k는 중간에 거칠 노드 i출발 j 도착
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    // 경로에서 갈수 있는지 체크
                    if (ar[i][k] == 1 && ar[k][j] == 1) {
                        ar[i][j] = 1;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                sb.append(ar[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}