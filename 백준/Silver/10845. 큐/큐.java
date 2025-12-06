import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] q = new int[N];
        int front=0;
        int back=0;
        StringBuilder sb = new StringBuilder();
        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push"))
                q[back++]=Integer.parseInt(st.nextToken());
            else if(str.equals("pop")){
                if(front==back)
                    sb.append(-1).append("\n");
                else
                    sb.append(q[front++]).append("\n");
            }
            else if(str.equals("size"))
                sb.append(back-front).append("\n");
            else if(str.equals("empty"))
                sb.append((front ==back)? 1: 0).append("\n");
            else if(str.equals("front"))
                if(front==back)
                    sb.append(-1).append("\n");
                else
                    sb.append(q[front]).append("\n");
            else if(str.equals("back"))
                if (front == back)
                    sb.append(-1).append("\n");
                else
                    sb.append(q[back - 1]).append("\n");
        }
        System.out.println(sb);
    }
}