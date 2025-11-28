import java.io.*;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        StringBuilder sb = new StringBuilder();

        String[] str;
        for (int i = 0; i < N; i++) {
            str = br.readLine().split(" ");//StringTokenizer 대신
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }

        for (int i = 0; i < N; i++) {
            int rank = 1;//초기

            for (int j = 0; j < N; j++) {
                if (j == i)
                    continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }
}