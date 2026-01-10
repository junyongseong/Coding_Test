import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        // 브루트포스 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String res = null;
        for (int i = 0; i < s.length() - 2; i++) {
            for (int j = i + 1; j < s.length() - 1; j++) {
                String a = s.substring(0, i + 1);
                String b = s.substring(i + 1, j + 1);
                String c = s.substring(j + 1);

                //문자열 뒤집기
                String ra = new StringBuilder(a).reverse().toString();
                String rb = new StringBuilder(b).reverse().toString();
                String rc = new StringBuilder(c).reverse().toString();

                //합치기
                String ca = ra + rb + rc;

                // 최소값 갱신
                if (res == null || ca.compareTo(res) < 0) {
                    res = ca;
                }
            }
        }
        System.out.println(res);

    }
}