import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = 0;
        
        for(int i = 0; i < 5; i++) {
            int answer = Integer.parseInt(st.nextToken());
            if(answer == T) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}