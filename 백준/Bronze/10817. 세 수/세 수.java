import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. sort 정렬 이용
        String s = br.readLine();
        String[] arr = s.split(" ");
        int[] numArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            numArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(numArr);
        System.out.println(numArr[1]);

        
        //2. 정렬 없이
        String[] arr = br.readLine().split(" ");
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (String s : arr) {
            int num = Integer.parseInt(s);

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        System.out.println(min2);

    }

}
