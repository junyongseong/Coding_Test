import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer,int[]> map = new HashMap<>();
        for(int i=0; i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] ar = new int[5];
            for(int j=0;j<5;j++){
                ar[j]=Integer.parseInt(st.nextToken());
            }
            map.put(i, ar);
        }

        int max = -1;
        int leader = 0;

        // 비교 로직
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            int[] a = map.get(i);

            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;
                int[] b = map.get(j);

                for (int k = 0; k < 5; k++) {
                    if (a[k] == b[k]) {
                        cnt++;
                        break; // 한 번이라도 같으면 볼 필요 없음
                    }
                }
            }

            if (cnt > max) {
                max = cnt;
                leader = i;
            }
        }

        // 학생 번호는 1부터니 +1
        System.out.println(leader + 1);
        //다음부턴 배열로[][] 로 풀것... 개고생하지말자
    }
}