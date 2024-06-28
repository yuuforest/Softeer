package Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob6280 {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int answer = 2;
        for (int i = 0; i < N; i++) {
            answer += (answer-1);
        }

        System.out.println(answer * answer);
        // System.out.println(Math.pow(answer, 2));
    }
}
