import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        //abs == *절대값*
        PriorityQueue<Integer> q = new PriorityQueue<>(
            (a,b)->{
                int absa = Math.abs(a);//이줄은  a=-1이면 1로 바꿔줌
                int absb = Math.abs(b);

                //뭐가 먼저 나와야하는지 규칙세워야함
                //절대값이 같으면 a-b음수면 a가 나올거고 양수면 b가 나올거임
                if(absa==absb){
                    return a-b;
                }else//이건 절대값이 같지 않을때니 절대값으로 비교해서 음수면 절대값 a양수면 절대값 b
                    return absa-absb;
            }
        );
        StringBuilder sb = new StringBuilder();
        //입력 먼저 받기
        for(int i=0;i<N;i++){
            int a = Integer.parseInt(br.readLine());
            
            if(a!=0)//입력 받은게 0이 아닐때니 추가
                q.add(a);
            else {
                if(q.isEmpty())//q가 비어있으면 0출력
                    sb.append(0).append("\n");
                else//q가 비어있지않고 0이면 출력하고 삭제
                    sb.append(q.poll()).append("\n");
            }
                
        }
        System.out.println(sb);
    }
}