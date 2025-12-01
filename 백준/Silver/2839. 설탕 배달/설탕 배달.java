import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        // 그리디 문제?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        while (N > 0) {
            if (N % 5 == 0) {//5로 나누어진다면
                result += N / 5;
                break;
            } else {//5로 나누어지는게 아니라면 3or 나누지 X
                N -= 3;
                result++;
            }
            if (N < 0) {//적으면 결국 -1
                result = -1;
            }

        }
        System.out.println(result);
    }
}