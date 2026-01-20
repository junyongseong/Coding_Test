import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int y1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int y2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        // LocalDate는 윤년 자동으로 계산해줌
        LocalDate start = LocalDate.of(y1, m1, d1);
        LocalDate end = LocalDate.of(y2, m2, d2);

        // 1000년 이상 차이나면 gg
        if (!end.isBefore(start.plusYears(1000))) {
            System.out.println("gg");
            return;
        }

        // ChronoUnit 자동으로 얼만큼 떨어져있는지 계싼해주는 놈
        long days = ChronoUnit.DAYS.between(start, end);
        System.out.println("D-" + days);
    }
}