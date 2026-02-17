import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){
            String line = br.readLine();

            int vowelCnt = 0;
            int conCnt = 0;

            for(int j = 0; j < line.length(); j++){
                char c = line.charAt(j);

                if(Character.isAlphabetic(c)){
                    if("AEIOUaeiou".indexOf(c) != -1){
                        vowelCnt++;
                    } else {
                        conCnt++;
                    }
                }
            }

            System.out.println(conCnt + " " + vowelCnt);
        }
    }
}
