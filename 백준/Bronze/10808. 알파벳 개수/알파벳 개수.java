import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();

        int[] arr = new int[26];

        char[] ch = s.toCharArray();
        for(char c : ch){
            int x = c - 'a';
            arr[x]++;
        }

       // 출력
        for(int i : arr){
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
