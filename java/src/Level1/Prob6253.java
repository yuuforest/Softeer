package Level1;

import java.io.*;
import java.util.*;

public class Prob6253 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A == B) {
            System.out.println("same");
        } else if (A < B) {
            System.out.println("B");
        } else if (A > B) {
            System.out.println("A");
        }
        
    }
    
}
