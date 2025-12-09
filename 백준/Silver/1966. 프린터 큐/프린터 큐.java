import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());//테스트 케이스 수
        for(int i=0; i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());//문서의 개수
            int M = Integer.parseInt(st.nextToken());//궁금한 문서 위치
            List<Integer> Q = new LinkedList<>();
            st =new StringTokenizer(br.readLine());
            for(int j =0;j<N;j++){
                Q.add(Integer.parseInt(st.nextToken()));
            }
            //여기까지 만들었으니 이제 회전?
            int count =0; //출력용
            while (true) {
                int front = Q.get(0);//먼저 맨앞에거
                boolean chk= false;//체크용 불린
                for(int j=1;j<Q.size();j++){
                    if(Q.get(j)>front){//만약 맨 앞에거보다 더 크다면
                        chk=  true;
                        break;
                    }
                }
                if(chk){//여기 왔다는건  뒤에게 더 크다는 소리
                    Q.remove(0);
                    Q.add(front);//회전 시키기

                    if(M==0){//M도 바꿔야함 내가 
                        M=Q.size()-1;
                    }else
                        M--;
                }else{//찾았음
                    count++;
                    Q.remove(0);
                    if(M==0){//M==0 이 되는  순간이 내가 찾는거
                        sb.append(count).append("\n");
                        break;
                    }else
                        M--;
                }
            }
        }
        System.out.println(sb);
    }
}