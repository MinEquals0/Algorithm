import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        /*
        // 1. 함수 이용
        int num = Integer.parseInt(s, 16);

        System.out.println(num);
        */

        // 2. 직접 작성
        int num = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int cValue = Character.digit(c,16);
            num = num * 16 + cValue;
        }
        
        System.out.println(num);

    }
}

