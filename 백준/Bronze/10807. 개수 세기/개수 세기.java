import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());

        // N만큼 배열을 만들어서 입력 받은 배열을 저장
        int[] newArr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = Integer.parseInt(arr[i]);
        }

        // 만든 배열을 돌면서 v와 같은 수가 있는지 비교
        int count = 0;
        for (int i : newArr) {
            if (i == v) {
                count++;
            }
        }
        System.out.println(count);
        // 조건을 만족하면 count++
    }
}