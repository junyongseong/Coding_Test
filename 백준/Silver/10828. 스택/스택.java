import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());//케이스
        int[] stack = new int[N];
        int start =-1;
        StringBuilder sb = new StringBuilder();
        while(N-->0){
            StringTokenizer st =new  StringTokenizer(br.readLine());
            String str= st.nextToken();
            if(str.equals("push"))
                stack[++start]=Integer.parseInt(st.nextToken());
            else if(str.equals("pop")){
                if(start==-1)
                    sb.append(-1).append("\n");
                else
                    sb.append(stack[start--]).append("\n");
            }
            else if(str.equals("size"))
                sb.append(start+1).append("\n");
            else if(str.equals("empty")){
                if(start==-1)//삼항연산자 써도 될듯
                    sb.append(1).append("\n");//1출력이었음
                else
                    sb.append(0).append("\n");
            }
            else if(str.equals("top")){
                if(start ==-1)
                    sb.append(-1).append("\n");
                else
                    sb.append(stack[start]).append("\n");
            }
        }
        System.out.println(sb);
    }
}