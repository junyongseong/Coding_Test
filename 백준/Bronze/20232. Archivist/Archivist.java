import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());

        String[] a = {
                "ITMO","SPbSU","SPbSU","ITMO","ITMO","SPbSU","ITMO",
                "ITMO","ITMO","ITMO","ITMO","PetrSU, ITMO","SPbSU",
                "SPbSU","ITMO","ITMO","ITMO","ITMO","SPbSU","ITMO",
                "ITMO","ITMO","ITMO","SPbSU","ITMO"
        };

        System.out.println(a[y - 1995]);

    }
}