
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        int sum = 91;

        while(i <= 3){
            int a = Integer.parseInt(br.readLine());

            if(i % 2 == 0){
                a = a * 3;
            }
            
            sum += a;
            i++;

        }

        System.out.println("The 1-3-sum is " + sum);

    }
}
