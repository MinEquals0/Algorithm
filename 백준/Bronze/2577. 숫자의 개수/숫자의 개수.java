import java.io.*;
import java.util.*;
import java.util.stream.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input1 = br.readLine();
        String input2 = br.readLine();
        String input3 = br.readLine();

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        int num3 = Integer.parseInt(input3);

        // 입력 제한 사항 확인하기
        int result = num1 * num2 * num3;
        String s = result + "";
        char[] ch = s.toCharArray();

        int[] arr = new int[10];

        for(char c : ch){
            int x = c - '0';
            arr[x]++;
        }

        // 출력
        for(int i : arr){
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
