
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char subject = str.charAt(0);

        if(subject == 'F'){
            System.out.println("Foundation");
        } else if (subject == 'C'){
            System.out.println("Claves");
        } else if (subject == 'V') {
            System.out.println("Veritas");
        } else if (subject == 'E'){
            System.out.println("Exploration");
        }


        // 2. switch
        switch (str.charAt(0)){
            case 'F':
                System.out.println("Foundation");
                break;
            case 'C':
                System.out.println("Claves");
                break;
            case 'V':
                System.out.println("Veritas");
                break;
            case 'E':
                System.out.println("Exploration");
                break;
        }

    }

}
