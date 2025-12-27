import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int year = Integer.parseInt(s);

        if(year % 4 == 0){
            if(year % 100 != 0 || year % 400 == 0){
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        } else {
            System.out.println(0);
        }


    }
}