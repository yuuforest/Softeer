package Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob7368 {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int answer = 0;

        answer += ((D / A) * (A+B)) + ((D % A) == 0 ? -B : (D % A));
        answer += ((D / B) * (A+B)) + ((D % B) == 0 ? -A : (D % B));

        System.out.println(answer);
    }
}
