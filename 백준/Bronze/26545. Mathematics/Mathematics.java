import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int res=0;
        for(int i=0; i<N;i++){
            int a = Integer.parseInt(br.readLine());
            res +=a;
        }
        System.out.println(res);

    }
}