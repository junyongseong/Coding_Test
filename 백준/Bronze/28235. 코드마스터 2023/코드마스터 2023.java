import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        switch (str) {
            case "SONGDO":
                    System.out.println("HIGHSCHOOL");
                break;
            case "CODE":
                    System.out.println("MASTER");
                break;
            case "2023":
                    System.out.println("0611");
                break;
            case "ALGORITHM":
                    System.out.println("CONTEST");
                break;
        }
    }
}