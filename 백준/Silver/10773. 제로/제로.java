import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result =0;

        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<N;i++){
            int a = Integer.parseInt(br.readLine());
            if(a==0)
                stack.pop();
            else
                stack.add(a);
        }
        while (!stack.isEmpty()) {
            result +=stack.pop();
        }
        System.out.println(result);
    }
}