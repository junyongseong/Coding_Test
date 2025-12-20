import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        //k개 랜선 가지고 있고
        //N개의 같은 길이의 랜선으로 만들고 싶음 how? K개의 랜선을 잘라서 만들어야함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());//랜선 K개의 수
        int N = Integer.parseInt(st.nextToken());//필요한 랜선의 수

        int ar[] = new int[K];//k개의 수 만큼 배열 생성
        for(int i=0; i<K;i++) {
            ar[i] = Integer.parseInt(br.readLine());//이렇게 배열 생성해놓음
        }
        //그리디? 아니면 가장 긴 랜선과 작은 랜선을 기준으로?
        long max=0;//가장 큰 랜선 먼저 찾기
        for(int i=0;i<K;i++){
            if(max<ar[i])
                max=ar[i];
        }
        max++;
        long min=1;
        long cen=0;
        while (min<max) {
            cen = (min+max)/2;//중앙값을 기준으로 계속 체크
            long count =0;//몇개인지 셀놈 계속 초기화 되야함

            for (int i = 0; i < ar.length; i++) {
                    count += (ar[i] / cen);
            }
            //upperbound?
            //중앙길이를 기준으로 잘랐을때 개수가 만약 원하는 랜선의 개수보다 작다면
            //자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다.
            if(count < N) {
				max = cen;
			}
			else {
				min = cen + 1;
			}
        }
        System.out.println(min-1);
    }
}