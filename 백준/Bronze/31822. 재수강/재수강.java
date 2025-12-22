import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().substring(0,5);
        int N = Integer.parseInt(br.readLine());
        int count=0;
        for(int i=0; i<N;i++){
            String st = br.readLine();
            if(st.startsWith(str))
                count++;
        }
        System.out.println(count);
    }
}