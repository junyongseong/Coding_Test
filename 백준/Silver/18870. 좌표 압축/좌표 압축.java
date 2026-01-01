import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] ar = new int[N];//N크기만큼 배열 생성
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++){
            ar[i] = Integer.parseInt(st.nextToken());
        }
        // Arrays.sort(ar);
        // int[] count = new int[N];
        // for(int i=0;i<ar.length;i++){
        //     for(int j=0;j<)
        // } //이거 무조건 시간 초과남 아닌듯;
        int[] sort =ar.clone();//ar배열을 하나 복사해서
        Arrays.sort(sort);//복사한걸 정렬

        //Map사용해서 키 로 비교한다?
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;

        //순위 넗어줌
        //ar은 무작위이고 sort는 정렬된 순서니 그대로 순서 넣어주면 순서대로 됨
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(sort[i])) {
                map.put(sort[i], count++);
            }
        }

        for (int i = 0; i < N; i++) {
            sb.append(map.get(ar[i])).append(" ");
        }

        System.out.println(sb);
    }
}