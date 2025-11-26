import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        if(A.length()>=B.length())
            System.out.println("go");
        else
            System.out.println("no");
    }
}