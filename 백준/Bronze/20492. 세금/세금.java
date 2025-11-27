import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =  Integer.parseInt(br.readLine());
        int A = (int)(N*0.78);
        int B= (int)(N*0.8 + (N*0.2*0.78));
        System.out.print(A+ " " + B);
    }
}