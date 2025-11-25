import java.io.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());//첫째줄
        int[] ar = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            ar[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ar);
        int M = Integer.parseInt(br.readLine());//첫째줄
        int[] ar2 = new int[M];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<M; i++){
            ar2[i]=Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();

        //바이너리 서치 찾으면 인덱스 반환 즉 양수이면 있다는거고
        //1 없다면 0 
        for (int i = 0; i < M; i++) {
            if (Arrays.binarySearch(ar, ar2[i]) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }

        System.out.print(sb);
    }
}