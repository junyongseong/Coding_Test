import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        //지민 64 want Xcm
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());

        //비트 카운트 만약 %2해서 홀수면 cnt++
        //아니면 나누기
        int cnt = 0;
        while (N > 0) {
            if (N % 2 == 1) 
                cnt++;
            N /= 2;
        }

        System.out.println(cnt);
    }
}