import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // List<Integer> list = new ArrayList<>();
        Queue<Integer> Q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            Q.add(i);
        } // 큐 채우기
          // 1번 : 먼제 제일 위에있는 카드를 바다겡 버리기
          // 2번 : 제일 위에 있는 카드를 아래로 내리기

        while (Q.size() > 1) {
            Q.poll();
            Q.add(Q.poll());
        }
        System.out.println(Q.poll());

    }
}