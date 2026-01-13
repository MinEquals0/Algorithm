import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split(" ");
        int[] numArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            numArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(numArr);

        System.out.println(numArr[1]);
    }
}