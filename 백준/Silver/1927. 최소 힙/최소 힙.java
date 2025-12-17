import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        //최소힙 우선순위를 찾고 그 값을 출력후배열 에서 제거
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());//연산의 개수
        Queue<Integer> q = new PriorityQueue<>();

        while (N-->0) {
            int a= Integer.parseInt(br.readLine());

            if(a==0){
                if(q.isEmpty())
                    System.out.println(0);
                else
                    System.out.println(q.poll());//출력및 제거ㅗ
            }else{
                q.add(a);
            }
        }
    }
}