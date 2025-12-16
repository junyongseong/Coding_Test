import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        //방향성 - 이후는 다 묶어버려서 빼버려라
        //-가 여러개이면 맨  마지막 -로 묶어라
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String sik = br.readLine();//받은  수식
        String[] minus =  sik.split("-");//마이너스 기준으로 나눔

        int result=0;//결과
        //첫번째 마이너스 앞 문자열을 + 기준으로 쪼갬
        //그후 문자열 배ㅇㄹ로 만든다
        String[] first =   minus[0].split("\\+");//맨 처음
        for(String s :first){
            result += Integer.parseInt(s);
        }
        //여기가 나머지 덩어리
        for(int i=1;i<minus.length;i++){
            String[] plus = minus[i].split("\\+");
            for(String s: plus){
                result-=Integer.parseInt(s);
            }
        }
        System.out.println(result);
    }
}