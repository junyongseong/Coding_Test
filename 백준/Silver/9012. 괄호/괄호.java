import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] ar= new String[N];
        for(int i=0;i<N;i++){
            ar[i]=br.readLine();
        }
        String[] check = new String[N];
        for(int i=0;i<N;i++){
            boolean valid = true;//체크용 불린 하나 추가
            int count=0;
            for(int j=0;j<ar[i].length();j++){
                if(ar[i].charAt(j)=='(')//시작은 무조건 (로 시작해야하니 이것만
                    count++;
                else
                    count--;

                if(count<0){// ) 즉 닫은 괄호가 더 많다는  소리
                    valid =false;
                    break;
                }
            }
            if(count != 0)
                valid = false;

            check[i] =valid ? "YES":"NO";
        }
        for(int i=0; i<N;i++){
            System.out.println(check[i]);
        }
    }
}