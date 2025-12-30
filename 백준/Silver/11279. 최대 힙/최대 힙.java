import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        //Collections.reverseOrder() 이게 없으면 가장 작은게 먼저 나감
        //따라서 뒤집어야함 우선순위  규칙을 큰게 먼저  나가게

        //주석 해제하고 실행해보면 원하는출력의반대로 나옴
        PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
        // PriorityQueue<Integer> q= new PriorityQueue<>();

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            int x = Integer.parseInt(br.readLine());
            if(x>0)//x가  자연수이면 우선순위 q에  추가
                q.add(x);
            else {
                if (q.isEmpty()) {//만약 비어있으면 0 출력하고
                    sb.append(0).append('\n');
                } else {//비어 있지 않은상태면 가장큰 수가 출력되고 삭제됨(q.poll())
                    sb.append(q.poll()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}