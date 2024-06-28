package Level1;

import java.io.*;

public class Prob7698 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < (N / 5); j++) {
                sb.append("++++ ");
            }

            for (int j = 0; j < (N % 5); j++) {
                sb.append("|");
            }
            
            System.out.println(sb.toString());
        }
    }
    
}
