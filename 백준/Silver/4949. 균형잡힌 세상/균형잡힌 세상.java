import java.io.*;
import java.util.*;

class Main {
    static Queue<String> Q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N;
        StringBuilder sb= new StringBuilder();
        while (true) {
            N= br.readLine();

            if(N.equals("."))
                break;

            sb.append(check(N)).append("\n");
        }
        System.out.println(sb);

    }
    static String check(String N){
        char[] chk = new char[N.length()];
        int size =0;

        for(char C :N.toCharArray()){
            if(C=='('||C=='['){
                chk[size] =C;
                size++;
            }
            else if(C  ==')'){
                if(size==0 ||chk[size-1]!='(')//사이즈가 이미 0 or 찾아도 읎을떄
                    return "no";
                else
                    size--;
            }
            else if(C ==']'){
                if(size==0 || chk[size-1] !='[')
                    return "no";
                else
                    size--;
            }
        }

        if(size !=0){
            return "no";
        }
        else
            return "yes";
    }
}