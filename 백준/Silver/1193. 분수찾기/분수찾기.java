import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int a = 0; //현재 대각선 번호
        int sum=0;//현재 대각선 개수의 누적

        //처음으로는 현재 N이 속한 대각선을 찾아야함
        //i번째에 있는 대각선의 누적개수는 i(i+1)/2
        //sum이 N보다 커지는순간 a가 답

        while (sum<N) {
            a++;
            sum+=a;
        }
        //이제 대각선을 찾았으니 그안에서의 위치를 찾아야함
        //이전 대각선까지 개수는 sum-a;
        //현재 위치 pos = a-이전대각선까지의 개수는

        int pos = N-(sum-a);
        int ja;//분자
        int mo;//분모
        if(a%2==0){
            ja=pos;
            mo = a-pos+1;
        }else{
            ja = a-pos+1;
            mo=pos;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(ja).append("/").append(mo);
        System.out.println(sb);
    }
}