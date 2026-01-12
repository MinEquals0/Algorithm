import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int order = 1;

        while (true){
            String s = br.readLine();
            int n0 = Integer.parseInt(s);

            if(n0 == 0){
                break;
            }

            System.out.print(order + ". ");
            int n1 = 3 * n0;
            int n2;
            if(n1 % 2 == 0){
                System.out.print("even ");
                n2 = n1/2;

            } else {
                System.out.print("odd ");
                n2 = (n1+1)/2;
            }

            int n4 = (3*n2) / 9;
            System.out.println(n4);

            order++;

        }
    }
}