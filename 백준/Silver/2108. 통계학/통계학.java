import java.io.*;
import java.util.*;

class Main {
    static int[] ar;

    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());// 홀수로 들어옴
        ar = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }
        int[] result = new int[4];// 정답 넣어둘 곳
        // 첫번째 산술 평균 (N개의 수 합을 N으로 나눔)
        // 합 모아둘곳
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += ar[i];
        }
        result[0] = (int) Math.round((double) sum / N);
        // 배열 정렬
        Arrays.sort(ar);
        // 중앙값 N/2
        result[1] = ar[N / 2];

        // 최빈값 =가장 많이 나타나는 놈
        int[] count = new int[8001];// 키운트 셀 놈 -4000~4000임

        for (int i = 0; i < N; i++) {// 카운트 채워놓기
            count[ar[i] + 4000]++;// +4000하는 이유 음수 방지
        }
        // 이제 찾기 최빈값 찾기
        int max = 0;
        for (int i = 0; i < 8001; i++) {
            if (count[i] > max)
                max = count[i];
        }
        // 최빈값 후보들 모음list
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 8001; i++) {
            if (count[i] == max) {
                list.add(i - 4000);
            }
        }
        if (list.size() == 1)
            result[2] = list.get(0);
        else
            result[2] = list.get(1);

        result[3] = ar[N - 1] - ar[0];

        for(int i =0; i<=3;i++){
            System.out.println(result[i]);
        }
    }
}