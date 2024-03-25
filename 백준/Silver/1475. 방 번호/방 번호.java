import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        // 배열로 변환
        char[] ch = str.toCharArray();

        int[] counts = new int[10]; //

        for (char c : ch) {
            int index = c - '0';
            counts[index]++;
        }

        // 6과 9
        int count = (counts[6] + counts[9] + 1) / 2;

        for (int i = 0; i < 10; i++) {
            if (i != 6 && i != 9) {
                count = Math.max(count, counts[i]);
            }
        }

        System.out.println(count);

    }
}