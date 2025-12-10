import java.io.*;
import java.util.*;


class Main {
    static int next=1;
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());//테케임
        Stack<Integer> stack = new Stack<>();//스택 생성
        StringBuilder sb = new StringBuilder();
        boolean chk = false;
        for(int i=0;i<N;i++){
            int n= Integer.parseInt(br.readLine());
            for(;next<=n;next++){
                stack.push(next);
                sb.append("+").append("\n");
            }
            if(stack.peek()==n){
                stack.pop();
                sb.append("-").append("\n");
            }
            else{
                chk=true;
            }
        }
        if(chk)//false
            System.out.println("NO");
        else
            System.out.println(sb);
    }
}